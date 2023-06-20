package inheritance.practice01;

public class Student extends Person{
	
	private String hakbun; // 학번

	public Student() {
		System.out.println("Student()");
	}

	public Student(String name, int age, String hakbun) {
		super(name,age);
		this.hakbun=hakbun;
		System.out.println("Student(String name, int age, String hakbun");
		
		
	}
	
	//Method overriding
	//
	
	
	public String getHakbun() {
		return hakbun;
	}

	@Override
	public void printInfo() {
		System.out.println("Person.printInfo() : ");
				System.out.println("이름=" + getName());

				System.out.println("|나이=" + getAge());
				}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

}
