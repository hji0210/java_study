package thisisjava01;

public class MobilePhoneApp {//값만 셋팅(출력만 됨) 

	public static void main(String[] args) {
	
		/**조건(데이터 타입)
		 *- 펜 : boolean
		 * - 메모리, 스토리지, 배터리 : int
		 */
		
		//object 1 
		MobliePhone mp1 = new MobliePhone();
		mp1.company = "삼성전자";
      	mp1.product = "Galaxy S23 ultra";
      	mp1.operatingsystem = "안드로이드";
		mp1.color = "black";
		mp1.pen = true;
		mp1.memory = 12;
		mp1.battery = 5000;
	
		
		
		mp1.a();
//		
//		
		
		
		
		
		//object 2
	  MobliePhone mp2 = new MobliePhone();
	   mp2.company = "애플";
	   mp2.product = "iphone 14 pro";
	   mp2.operatingsystem = "ios";
	   mp2.color = "gold";
	   mp2.pen = false;
	   mp2.memory =  8;
	   mp2.battery = 5000;
//	   
//	   
	   mp2.a();
//	   
	   
	   
	   
	   
//	 
//		
//		
//	}  

 }
}
