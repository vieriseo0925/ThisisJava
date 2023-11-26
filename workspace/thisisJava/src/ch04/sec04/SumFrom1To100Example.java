package ch04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0; // 합계변수
		int i; // 카운터 변수
		
		for(i = 1; i <= 100; i++) { // i는 101되면 조건식에 맞지 않아 빠져 나옴.
			sum += i; 
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		// i는 sum + 100 연산을하고 나서 증감연산자 i++로 101이 되어 다시 조건식으로 평가를 하니 
		// 출력문 println에서 1~100까지의 합 : 보여줘야하기 떄문에 (i-1)로 표현한 것이다. 
	}

}
