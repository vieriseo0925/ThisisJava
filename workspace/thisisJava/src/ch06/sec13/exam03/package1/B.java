package ch06.sec13.exam03.package1; // 패키지가 A.java와 동일!

public class B {
	public void method() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;		// o
		a.field2 = 1;		// o
		a.field3 = 1;		// x	← private 필드 접근 불가(컴파일 에러)
		
		//메소드 호출
		a.method1();		// o
		a.method2();		// o
		a.method3();		// x	← private 필드 접근 불가(컴파일 에러)
	}
}
