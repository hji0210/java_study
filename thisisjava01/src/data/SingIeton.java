package data;

public class SingIeton {
	//private 접근 권한을 갖는 정적 필도 선언과 초기화
	private static SingIeton Sing = new SingIeton();
	
	private SingIeton(){
		//생성자만들 때 class복사
	}
	
	public static SingIeton getInstance() {
		 return Sing;
		
	}
	
	
	
	
			
			
	
	

}
