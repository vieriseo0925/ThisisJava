package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; 
		++x;
		System.out.println("x= " + x); //12 
		
		System.out.println("---------------------");
		
		y--;
		--y;
		System.out.println("y= " + y); //8 
		
		System.out.println("---------------------");
		
		z = x++; // z ← 12 
		System.out.println("z= " + z);
		System.out.println("x= " + x); // 13
		
		System.out.println("---------------------");
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("---------------------");
		z = ++x + y++; // x: 15 + y: 8 z=23
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);		

	}

}
