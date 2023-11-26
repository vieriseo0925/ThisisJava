package ch04.sec05;

import java.util.Scanner; //입력(Scanner)를 사용하기 위해 필요

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 생성!
		boolean run = true; //while문의 조건식을 위한 변수 선언
		int speed = 0;
		
		while(run) { // 메뉴 생성
			System.out.println("------------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine(); //키보드에서 입력한 내용을 읽음		}
			
			if(strNum.equals("1")) {
				speed++; // 1 입력하면 증속!
				System.out.println("현재속도 = " + speed);
			} else if(strNum.equals("2")) {
				speed--; // 2 입력하면 감속!
				System.out.println("현재속도 = " + speed);
			} else if(strNum.equals("3")) {
				run = false; //3 입력하면 중지시켜야하는데 while문이니까 run(논리형)을 false로 변경
			}
		}
		System.out.println("프로그램 종료!"); // run -> false가 되어 while문 빠져나온 다음 실행되어야 함 
	}									 

}

