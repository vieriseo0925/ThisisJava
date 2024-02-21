package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50); // private로 설정되어 있는 speed 속성을 접근하여 수정! → Car클래스의 setSpeed에서 속도가 음수이므로 속도를 0으로 수정
		System.out.println("현재 속도 : " + myCar.getSpeed()); // private로 설정되어 있는 speed 속성을 접근하여 읽기!
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//멈춤
		if(myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}
