
public class Hanjiin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//시험 점수
		int korean = 88; //국어
		int english = 92; //영어
		int math = 100; //수학
		
		System.out.println("국어=" + korean);
		System.out.println("영어=" + english);
		System.out.println("수학=" + math);
		
		//시험 점수 합계, 평균
		int sum = korean + english + math; //합계
		int avg = sum/3; // 평균
		System.out.println("합계=" + sum);
		System.out.println("평균"=" + avg);
		
	}


    //학점 
	int sum = korean + english + math;
	int avg = sum / 3;

	String grade = " ";

	switch(avg / 10) {

	case 9, 10 ://90을 10으로나눔. 100을 10으로 나눔
	grade = "A";
	break;

	case 8 :
	grade = "B";
	break;

	case 7 :
	grade = "C";
	break;

	default ://그 외의 것들
	grade = "D";
	break;
	}

	System.out.println("합계=" + sum);
	System.out.println("평균=" + avg);
	System.out.println("학점=" + grade);

	}

	}