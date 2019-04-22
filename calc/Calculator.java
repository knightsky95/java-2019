package calc;

public class Calculator {
	float num1;
	float num2;


	float add() {
		return num1 + num2;
		//printResult();
	}

	float sub() {
		return num1 - num2;
		//printResult();
	}

	float mul() {
		return num1 * num2;
		//printResult();
	}

	float div() {
		return num1 / num2;
		//printResult();
	}

	float mod() {
		return num1 % num2;
	//	printResult();
	}

	float power() {
		return (float) Math.pow(num1, num2);
		//printResult();
	}

	void printResult(float result) {
		System.out.println("result is: " + result);
	}

}
