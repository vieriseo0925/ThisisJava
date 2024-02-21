package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();								// 부모클래스 Airplane 메소드 호출
		sa.fly();									// 자식클래스 SupersonicAirplane 상태필드 선언 → "1" ∴ 일반비행
		sa.flymode = SupersonicAirplane.SUPERSONIC;	// flymode를 SUPERSONIC "2"로 변경
		sa.fly();									// 자식클래스에서 재정의된 fly 메소드 호출
		sa.flymode = SupersonicAirplane.NORMAL;		// flymode를 NORMAL "1"로 변경
		sa.fly();									// 자식클래스에서 재정의된 fly 메소드 호출
		sa.land();									// 부모클래스 land 메소드 호출
	}
}
