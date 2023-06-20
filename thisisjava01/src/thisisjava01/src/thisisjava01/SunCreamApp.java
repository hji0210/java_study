package thisisjava01;

public class SunCreamApp {

	public static void main(String[] args) {
	
		
		/**
		 * 조건(데이터 타입)
	  char : 피부타입 s(sensitive, 민감성), 0(oily, 지성), n(nenutral, 중성),d(dry 건성)
		 *  - int : 용량 
		 *  - boolean : 끈적임
		*/
		
		
		//object 1
		SunCream sc1 = new SunCream();
		sc1.company = "니베아";
		sc1.product = "선 페이스 수딩 센서티브 크림";
		sc1.sticky = false;  
		sc1.skintype = 's';//문자 하나는 char이고 문자열은 String
     	sc1.volume = 50;
		sc1.spf=50;
		sc1.pa="+++";

//		
		sc1.printInfo();//시스템 아웃썼는데 중복피하려고 씀
//		

	}

}
