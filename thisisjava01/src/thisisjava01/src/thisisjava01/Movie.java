package thisisjava01;

public class Movie {
	
	String title;
	String category;
	String diretor;
	int runningTime;
	
	public Movie() {
		System.out.println("Movie()");
	}
     
	public Movie(String title, String category, String diretor,int runningTime) {////생성자 호출
		   this.title =  title;
		   this.category = category;
		   this.diretor = diretor;
		   this.runningTime=runningTime;
		   
	}
		   

}
