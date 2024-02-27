package ch07.sec07.exam01;

class A {
	
}

class B extends A{
	
}

class C extends A{
	
}

class D extends B{
	
}

class E extends C{
	
}

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;		//자동타입 변환(상속 관계에 있음)
		A a2 = c;		// "
		A a3 = d;		// "
		A a4 = e;		// "
		
		B b1 = d;		// "
		C c1 = e;		// "
		
		B b3 = e;		//컴파일 에러 "Type mismatch: cannot convert from E to B"
		C c2 = d;		//컴파일 에러 "Type mismatch: cannot convert from D to C"
	}

}
