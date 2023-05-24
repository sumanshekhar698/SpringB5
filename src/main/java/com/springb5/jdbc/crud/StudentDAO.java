package com.springb5.jdbc.crud;

public interface StudentDAO {

	// C - reate
	public int insert(Student s);

	// R - ead
	public Student getSingleStudent(int id);
	//multiple student read
	//get all student //query()
	
	//U
	public int update(Student s);
	
	
	//D
	public int delete(int id);

}
