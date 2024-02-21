package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();
		
		//자동 타입 변환
		Parent parent = child;	//Child클래스의 child 객체를 Parent 클래스로 타입 변환!
		
		//메소드 호출
		parent.method1();
		parent.method2();
		//parent.method3(); //"The method method3() is undefined for the type Parent" 컴파일 에러 발생!

	}

}
