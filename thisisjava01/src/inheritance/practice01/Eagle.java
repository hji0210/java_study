package inheritance.practice01;

public class Eagle extends Animal{
	
	private String animal;
    private int wing;

	public Eagle( String name, int age, String gender, int wing) {
		super( name, age, gender);
		this.animal = "Eagle";//생성자만들 때 동물이 없었는데 출력되었을 때 동물이 찍혀서 따로 만든 것
		this.wing = wing;
		
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	@Override
	public void printInfo() {
		 System.out.println();
		 System.out.println("=====Eagle Info ======");
	   	 System.out.print("동물=" +animal );
	   	 System.out.print(" | 이름="+ getName());
	   	 System.out.print(" | 나이="+ getAge() );
	   	 System.out.print(" | 성별="+ ((getGender() == "F") ? "여" : "남"));
	   	 System.out.println(" | 날개="+ wing);
	  
	   	 
	}
	
	
	public void fly( ) {
		System.out.println(getName() + ":: fly()");
	}
       
	
	
	
	
}
