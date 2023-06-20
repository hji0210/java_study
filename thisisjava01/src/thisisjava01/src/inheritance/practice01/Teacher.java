package inheritance.practice01;

public class Teacher extends Person{

	private String lesson; // 과목

	//생성자
	public Teacher() {
		System.out.println("Teacher()");
	}
	
      public Teacher(String name, int age, String lesson) {
	  super(name,age);
	  this.lesson = lesson;
	  System.out.println("Teacher(String name, int age, String lesson)");
       }
	
	
	
	
	
	
	
	
	public void setLesson(String lesson) {
        this.lesson=lesson;
	}


	public String getLesson() {
		return lesson;
	}

}


