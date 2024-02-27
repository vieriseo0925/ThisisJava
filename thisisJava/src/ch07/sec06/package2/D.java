package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
	//생성자 선언
	public D() {
		// A() 생성자 호출 
		super();				//가능!
	}
	
	//메소드 선언 
	public void method1() {		//A클래스 상속을 통해서만 가능한 것이여!
		// A 필드값 변경 
		this.field = "value";	//가능!
		// A 메소드 호출 
		this.method();			//가능!
	}
	
	//메소드 선언
	public void method2() {
		A a = new A();			//불가! why?) 부모클래스 생성자를 직접 호출 할 수 없다. -> 자식 생성자에서
		a.field = "value";		// "super()"로 A생성자를 호출할 수 있다!
		a.method();				//A클래스의 필드와 메소드가 숨겨진 것처럼 코드 칠 때 자동완성이 되지 않는다!
	}
}
