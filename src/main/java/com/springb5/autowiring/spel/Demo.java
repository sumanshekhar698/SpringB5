package com.springb5.autowiring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
@Component

public class Demo {

	@Value("100")//spEL
	private int x;
	
	@Value("#{6 + 6}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(169)}")
	private double m;
	private double n;
	
	@Value("#{88 % 2 == 0 ? true : false}")
	private boolean isSpringEasy;
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo(int x, int y, double m, double n, boolean isSpringEasy) {
		super();
		this.x = x;
		this.y = y;
		this.m = m;
		this.n = n;
		this.isSpringEasy = isSpringEasy;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", m=" + m + ", n=" + n + ", isSpringEasy=" + isSpringEasy + "]";
	}



	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	public boolean isSpringEasy() {
		return isSpringEasy;
	}

	public void setSpringEasy(boolean isSpringEasy) {
		this.isSpringEasy = isSpringEasy;
	}
}
