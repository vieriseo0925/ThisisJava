package ch05.ExamTest;

public class GetMinNumMaxNum {

	public static void main(String[] args) { /* 배열 마지막부터 인덱스 0~4까지 비교하여 맨 뒤 항목의 값보다 작으면 그 값을 최소로 하고, 배열 처음부터
						인덱스 0~4까지 비교하여 맨 처음 항목의 값보다 크면 그 값을 최대로 하는 코드*/
		int[] array = {1, 5, 3, 8, 2};
		int MinNum = array[4];
		int MaxNum = array[0];
		for(int i = 0 ; i < array.length; i++) { //배열array 항목 수 만큼 반복 인덱스 : 0~4 총 5회 반복
			if(MaxNum < array[i]) { // MaxNum(0)과 array[0] 값을 비교
				MaxNum = array[i];	//MaxNum값보다 array[0] 값을 비교하여 array[0] 값이 크면 MaxNum변수에 저장
			}
			if(MinNum > array[i]) {	// MinNum값과 배열 항목 값 비교
				MinNum = array[i]; // MinNum(0)이 배열 array[0](1) 비교-> 0 > 1 거짓
			}
		}
		System.out.println("최대값" + MaxNum);
		System.out.println("최소값" + MinNum);
	}

}
