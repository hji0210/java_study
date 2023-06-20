package thisisjava01;

public class User {
	
	  private String name;
	  private int age;
	  private float height;
	  private char sex;
	  private boolean marriageYn;
	  
	  public User() {}	//호출 User u1 = new User();
	  public User(String name, int age, char sex) {
		  this.name = name;
		  this.age= age;
		  this.sex=sex;
	  }
	  public User(String name, int age, char sex, float height, boolean marriageYn) {
		  this.name = name;
		  this.age= age;
		  this.sex=sex;
		  this.height=height;
		  this.marriageYn=marriageYn;
				
		  
		  
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
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean getMarriageYn() {
		return marriageYn;
	}
	public void setMarriageYn(boolean marriageYn) {
		this.marriageYn = marriageYn;
		
	}
	
	  void printInfo() { //메소드(기능) 작업함 메소드=함수. void=
			System.out.println("===user Info=======");
		    System.out.println("이름= " + name  );
			System.out.println("나이= " + age );
			System.out.println("키= " + height );
			System.out.println("성별= " + name );
			System.out.println("결혼 여부= " + marriageYn );
	
	  }	
}
	  
	  
	