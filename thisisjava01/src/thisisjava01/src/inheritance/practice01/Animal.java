package inheritance.practice01;

public class Animal {
     private String animal;
     private String name;
     private int age;
     private String gender;
     
     
	public Animal(String animal, String name, int age, String gender) {

	    this.animal = animal;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	 

	public Animal(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}



	public String getAnimal() {
		return animal;
	}


	public void setAnimal(String animal) {
		this.animal = animal;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
     public void printInfo() {
    	 System.out.println("=====Animal Info ======");
    	 System.out.print("동물=" +animal );
    	 System.out.print(" | 이름="+ name );
    	 System.out.print(" | 나이="+ age );
    	 System.out.println(" | 성별="+ ((gender == "F") ? "여" : "남"));

    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    		 
    	 
     }
     
    
     
     
}
