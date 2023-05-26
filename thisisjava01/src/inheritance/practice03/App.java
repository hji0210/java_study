package inheritance.practice03;

public class App {

	public static void main(String[] args) {
		
		Person p = new Person("Paige",20);
		Student s = new Student("James", 30, "2023-001");
		Teacher t = new Teacher("Victoria", 40, "Music");
				
	   Biz biz = new Biz();
		System.out.println("===polymorphic Argument====");
		
		biz.top(p);
		biz.top(s);
		biz.top(t);
		
		
		System.out.println("===== top()====");
		biz.top(p);
		biz.top(s);
		biz.top(t);
		
		System.out.println("===== down()====");
		biz.top(p);
		biz.top(s);
		biz.top(t);
		
		
	}

}
