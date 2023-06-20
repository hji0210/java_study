package interface03;

public class Bird extends Animal {
       
    private int wings;

	public Bird(int age, int wings) {
		super(age);
		this.wings = wings;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	@Override
	public void printInfo() {
		System.out.print("나이= " + getAge() + " : " );
		System.out.println("날개수= " + wings );
	}
   
	
       
}

