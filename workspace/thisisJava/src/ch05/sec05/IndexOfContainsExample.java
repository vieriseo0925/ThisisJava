package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location); // substring -> 문자열 잘라내기 메소드
		System.out.println(substring); // 0, 1, 2, 3 -> 3출력
		
		location = subject.indexOf("자바"); // 0을 출력
		if (location != -1) { // 문자열이 포함되어 있지 않다면~
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}

}
