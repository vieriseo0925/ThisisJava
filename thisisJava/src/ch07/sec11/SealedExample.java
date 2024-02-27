package ch07.sec11;

public class SealedExample {

	public static void main(String[] args) {
		// 객체 생성
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		//work() 메소드 호출
		p.work();
		e.work();
		m.work();
		d.work();
	}
}
