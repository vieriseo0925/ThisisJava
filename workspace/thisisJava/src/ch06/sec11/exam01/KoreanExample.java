package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		//객체 생성 시 주민등록번호와 이름 전달
		Korean k1 = new Korean("123456-1234567", "김자바");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//Final 필드는 아래 처럼 값을 변경할 수 없음
		//k1.nation = "USA"
		//k1.ssn = "123-12-1234";
		
		//비 Final 필드는 값 변경 가능
		k1.name = "감자바";
		System.out.println("개명된 k1의 이름은 : " + k1.name);

	}

}
