package ch07.sec07.exam03;

public class ChildExample {
	public static void main(String[] args) {
		//객체 생성 및 자동 타입 변환
		Parent parent = new Child();
		
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 parent.field2 = "data2";		//불가능 Why? 부모클래스로 타입 변환하게 되면 "부모 타입에 선언된 필드와 메소드만 사용가능!"
		 paretn.method3();				//불가능							"
		 */
		
		//강제 타입 변환
		Child child = (Child) parent;
		
		//Child 타입으로 필드와 메소드 사용
		child.field2 ="data";			//가능
		child.method3();				//가능
	}
}
