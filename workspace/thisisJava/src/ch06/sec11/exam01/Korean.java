package ch06.sec11.exam01;

public class Korean {
	//인스턴스 final 필드 선언 "final 필드 -> 초기값이 저장되면 이것이 최종적인 값이 되어 프로그램 실행 도중 수정불가!"
	final String nation = "대한민국";
	final String ssn;
	
	//인스턴스 필드 선언
	String name;
	
	//생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
