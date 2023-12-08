package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println("생년월일: " + firstNum);
		
		String secondNum = ssn.substring(7, 13);
		System.out.println("주민등록번호 뒷자리: " + secondNum);
	}

}
