package com.springb5.jdbc.crud;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDAOImpl implements StudentDAO {

	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public int insert(Student s) {

		String query = "INSERT INTO STUDENT VALUES(?,?,?)";// ? = PLACEHOLDERS //SQL INJECTION can be prevented via use
															// of placeholders
		int update = this.jdbc.update(query, s.getId(), s.getName(), s.getCity());

		return update;
	}

	public Student getSingleStudent(int id) {
		String query = "SELECT * FROM STUDENT WHERE ID = ?";
		Student s = this.jdbc.queryForObject(query, new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

				return new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
			}

		},id);

		return s;
	}

}
