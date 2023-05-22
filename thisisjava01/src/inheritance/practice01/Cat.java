package inheritance.practice01;

public class Cat extends Animal {

	private String animal;
	private int leg;

	public Cat(String name, int age, String gender, int leg) {
		super(name, age, gender);
		this.animal = "Cat";
	    this.leg = leg; //cat이 찍혀야해서 부모에서 생성자를 다시 만들고 cat에 와서 생성자 만듬
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	@Override
	public void printInfo() {
	 System.out.println("=====Animal Info ======");
   	 System.out.print("동물=" +animal );
   	 System.out.print(" | 이름="+ getName());
   	 System.out.print(" | 나이="+ getAge() );
   	 System.out.print(" | 성별="+ ((getGender() == "F") ? "여" : "남"));
   	 System.out.println(" | 다리="+ leg);
	} 
	
	public void sleep() {
		System.out.println(getName() + ":: sleep()"  );
	}
     
     
}
