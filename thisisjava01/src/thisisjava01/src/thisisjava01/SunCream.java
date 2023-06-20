package thisisjava01;

public class SunCream {
	 String company;//값만 가져감
	 String product;
	 boolean sticky;
     int volume;
     char skintype;
     int spf;
     String pa;
     
     void printInfo() { //메소드(기능) 작업함 메소드=함수. void=
			System.out.println("===========SunCream Info==========");
			System.out.println("회사=" + company );
			System.out.println("제품=" + product );
			if (sticky) {
				System.out.println("끈적임 있음.");
				} else {
					System.out.println("끈적임 없음.");
				}
            
		
			if (skintype) {
				System.out.println("sensitive");
				} else {
					System.out.println("민감성 아님.");
				}
            
			System.out.println("용량=" + volume);
			System.out.println("자외선=" + spf );
			System.out.println("uv-a차단=" + pa);

		
		
			
			

	}
   
     
   
     
 
	}
		
     

