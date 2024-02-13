package ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;	// .으로 Calculator 클래스의 정적 필드 접근
		int result2 = Calculator.plus(10, 5);		// .으로 Calculator 클래스의 정적 필드 접근
		int result3 = Calculator.minus(10, 5);		// .으로 Calculator 클래스의 정적 필드 접근
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
