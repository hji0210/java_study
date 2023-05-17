package reportcardapp;

public class ReportCard { // dead =>> new
	// 변수 : 이름, 한국어 점수, 영어 점수, 수학 점수
	
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public ReportCard(String name, int korean, int english, int math) {
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.math=math;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKorean() {
		return korean;
	}


	public void setKorean(int korean) {
		this.korean = korean;
	}


	public int getEnglish() {
		return english;
	}


	public void setEnglish(int english) {
		this.english = english;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}
     
	public int sum() {
		return korean+english+math;
	}

	public int average() {
		return (korean+english+math)/3;
	}
	
	public char hakjum() {
		// 평균이 90이상이면 a, 80이상하면 b, 70이상하면 c, 69이하면 d
	     char result = 0;
	     
	     // 1 ge
	     // sus ser
		 if(this.average()>=90) {
			 result = 'A';
	     }else if(this.average()>=80) {
	    	 result = 'B';
	     }else if(this.average()>=70){
	    	 result = 'C';
	     }
		 
		return result;
		// 1. mon ga return
		// 2. mon ga ba gger ya ham
		// 3. ba ggil a mun??? if ssu ja
		
	}

}
