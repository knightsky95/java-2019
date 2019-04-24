package student;

public class TestStudent {
	private static java.util.Scanner scan;

	public static void main(String[] args) {
		scan = new java.util.Scanner(System.in);
		Student s1=new Student();
		System.out.println("ENter your id:");
		s1.setId(scan.nextInt());
		System.out.println("enter your name");
		s1.setName(scan.next());
		System.out.println("enter your marks in every subject: ");
		s1.setM1(scan.nextFloat());
		s1.setM2(scan.nextFloat());
		s1.setM3(scan.nextFloat());
		s1.setM4(scan.nextFloat());
		s1.setM5(scan.nextFloat());
		s1.setM6(scan.nextFloat());
		s1.calculate();
		s1.print();
		
	}
}
