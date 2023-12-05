package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		intArray[0] = 10; // NullpointerException intArray가 참조하는 배열객체가 없기 때문 
		
		String str = null;
		System.out.println("총 문자 수: " + str.length()); /* NullPointerException str변수가 
		참조하는 객체가 없으므로 str의 길이를 구할 수 없기 때문 */
		
	}

}
