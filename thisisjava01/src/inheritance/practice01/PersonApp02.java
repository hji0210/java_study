package inheritance.practice01;

public class PersonApp02 {

	public static void main(String[] args) {
		
		System.out.println("====Person===");//부모
		Person p1 = new Person();
		System.out.println("====Student===");//자식
		Student s1 = new Student();
		System.out.println("====teacher===");//자식  ->부모가 person이라 부모꺼도 찍힘
		Teacher t1 = new Teacher();
	}

}
