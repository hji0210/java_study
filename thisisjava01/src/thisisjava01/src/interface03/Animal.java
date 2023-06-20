package interface03;

public class Animal {

    private int age;
    private String name;
   
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Animal(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    public void  printInfo() {
    	System.out.print("나이= " + age + " : " );
		System.out.println("이름= " + name  );
    }
}
