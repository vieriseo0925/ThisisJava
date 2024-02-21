package ch06.sec13.exam01.package2; //<- 패키지가 다름!

import ch06.sec13.exam01.package1.*;

public class C {
	//필드 선언
	A a;	// x <- A클래스 접근 불가(컴파일 에러) Why? A클래스의 접근제한이 default였기 때문! 
	B b;	// o
}
