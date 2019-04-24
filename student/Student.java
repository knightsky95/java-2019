package student;

public class Student {
	private int id;
	private String name;
	private float m1;
	private float m2;
	private float m3;
	private float m4;
	private float m5;
	private float m6;
	private float percentage;
	public int getId() {
		return id;
	}
	public float getM1() {
		return m1;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public float getM3() {
		return m3;
	}
	public void setM3(float m3) {
		this.m3 = m3;
	}
	public float getM4() {
		return m4;
	}
	public void setM4(float m4) {
		this.m4 = m4;
	}
	public float getM5() {
		return m5;
	}
	public void setM5(float m5) {
		this.m5 = m5;
	}
	public float getM6() {
		return m6;
	}
	public void setM6(float m6) {
		this.m6 = m6;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void calculate() {
		percentage=(float)((m1+m2+m3+m4+m5+m6)/6);
	}
	public void print() {
		System.out.println("The Total Percentage is : " + percentage);
	}
	
}
