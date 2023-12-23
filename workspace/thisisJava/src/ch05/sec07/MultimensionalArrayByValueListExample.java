package ch05.sec07;

public class MultimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores = {
				{80, 90, 96 },
				{76, 88}
		};
		
		//배열의 길이
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열 길이(첫번째 반의 학생 수): " + scores[0].length);
		System.out.println("2차원 배열 길이(두번째 반의 학생 수): " + scores[1].length);
		
		//첫 번째 반의 세번째 학생의 점수 일기
		System.out.println("scores[0][2]: " + scores[0][2]);
		
		//두 번째 반의 두번째 학생의 점수 일기
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		//첫번째 반의 평균 점수 구하기
		int class1Sum = 0;
		for (int i = 0; i < scores[0].length ; i++) {
			class1Sum += scores[0][i]; 
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫번째 반의 평균 : " + class1Avg);

		//두번째 반의 평균 점수 구하기
				int class2Sum = 0;
				for (int i = 0; i < scores[1].length ; i++) {
					class2Sum += scores[1][i]; 
				}
				double class2Avg = (double) class2Sum / scores[1].length;
				System.out.println("두번째 반의 평균 : " + class2Avg);
		//전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for (int i = 0 ; i < scores.length; i++) { 			//반의 수만큼 반복 2개의 반.. 2번 반복!
			totalStudent += scores[i].length;				//반의 학생 수 합산 첫번째 반 : 3명, 두번째 반 : 2명
			for ( int j = 0; j < scores[i].length; j++) { 	//해당 반의 학생 수만큼 반복  
				totalSum += scores[i][j];					//학생 점수 합산
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수 : " + totalAvg);
	}
}
