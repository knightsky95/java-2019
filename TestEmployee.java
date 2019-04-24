package emp;

public class TestEmployee {
	private static java.util.Scanner scan;

	public static void main(String[] args) {

		scan = new java.util.Scanner(System.in);
		Employee e1 = new Employee();
		System.out.println("Enter the EmployeeID: ");

		e1.setId(scan.nextInt());
		System.out.println("Enter your name:");
		e1.setName(scan.next());
		System.out.println("Enter the basic salary");
		e1.setBasic(scan.nextFloat());
		e1.calculate();
		e1.print();
	}
}
