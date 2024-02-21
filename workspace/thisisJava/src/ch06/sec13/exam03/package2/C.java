package ch06.sec13.exam03.package2;		//a.java b.java와 패키지가 다름!

import ch06.sec13.exam03.package1.*;

public class C {
	public C() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;		//o
		a.field2 = 1;		//x		← default(=같은 패키지 안에서만 접근 가능) 필드 접근 불가
		a.field3 = 1;		//x		← private 필드 접근 불가(컴파일 에러)
		
		//메소드 호출
		a.method1();		//o
		a.method2();		//x		← default(=같은 패키지 안에서만 접근 가능) 필드 접근 불가
		a.method3();		//x		← private 필드 접근 불가(컴파일 에러)
	}
}
