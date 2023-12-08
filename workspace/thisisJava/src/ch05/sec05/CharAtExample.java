package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "9506241230123";
		char gender = ssn.charAt(6);
		switch (gender) { // switch문을 다시 공부해야 겠다.. 헷갈림
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}

}
