package ch04.sec03;

public class SwitchExpressionExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");
					}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
					}
		default -> {
			System.out.println("손님입니다.");
					}

		}
		
		// Java 12 이후부터 switch문에서 Expression(표현식)을 사용 할 수 있다. 
		// Break문을 없애는 대신에 중괄호를 사용하여 가독성이 좋아짐!
		switch(grade) {
		case 'A', 'a' -> System.out.println("우수 회원입니다.");
		case 'B', 'b' -> System.out.println("일반 회원입니다.");
		default -> System.out.println("손님입니다.");
		}

	}

}
