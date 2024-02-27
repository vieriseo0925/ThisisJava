package ch07.sec06.package2;		//다른 패키지

import ch07.sec06.package1.A;

public class C {
	//메소드 선언 
	public void method() {
		A a = new A();		//"The constructor A() is not visible" A클래스가 "protected"로 선언 되어 있
		a.field = "value";  //때문에 접근할 수 없음 -> A클래스의 필드와 메소드를 "public"으로 바꾸라는 메시지 나
		a.method();
	}
}
