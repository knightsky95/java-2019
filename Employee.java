package emp;

public class Employee {
	private int id;
	private String name;
	float salary;
	private float basic;

	public float getBasic() {
		return basic;
	}

	public void setBasic(float basic) {
		this.basic = basic;
	}

	void print() {
		System.out.println("EmployeeID: " + id);
		System.out.println("Name: " + name);
		System.out.println("salary= " + salary);
	}

	public int getId() {
		return id;
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
		salary = (float) (basic + (0.15 * basic) + (0.20 * basic));

	}

}
