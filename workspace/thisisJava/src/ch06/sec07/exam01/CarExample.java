package ch06.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "검정", 250); //Car클래스 new 연산자로 생성자 호출 시 매개값을 생성자 블록 내부로 전달!
		//Car myCar = new Car(); //기본생성자 호출 못함!
	}
}
