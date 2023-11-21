package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) {	// { }를 5번 반복 실행 i -> 0, 1, 2, 3, 4 총 5회
			var1++;
			System.out.println("var1: " + var1); // 126, 127, -128, -127, -126
		}
		System.out.println("------------------");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {	// { }를 5번 반복 실행 i -> 0, 1, 2, 3, 4 총 5회
			var2--;
			System.out.println("var2: " + var2);
		}

	}

}
