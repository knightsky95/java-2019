package calc;

public class TestCalculator {
	static float result=0.0f;
	private static java.util.Scanner scan;
	public static void main(String[] args) {
		Calculator c =new Calculator();
		scan = new java.util.Scanner(System.in);
		System.out.println("Enter two numbers: ");
		c.num1=scan.nextFloat();
		c.num2=scan.nextFloat();
		System.out.println("Enter a choice from following: ");
		System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIVIDE\n5.MODULUS\n6.POWEROF");
		int choice =scan.nextInt();
		switch(choice) {
		case 1:
			result = c.add();
			break;
		case 2:
			result=	c.sub();
			break;
		case 3:
			result=c.mul();
			break;
		case 4:
			result=	c.div();
			break;
		case 5:
			result=	c.mod();
			break;
		case 6:
			result=c.power();
			break;
		default:
			System.out.println("INVALID CHOICE.");
			break;
		}
		c.printResult(result);
	}
}
