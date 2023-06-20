package Exception05;


public class Service {

	public void method() {
		System.out.println("\t\tService.method()::Start");
		

	
		String[] stringArray = new String[3];
		stringArray[0] = "A";
		stringArray[1] = "B";
		stringArray[2] = "C";
		

		
		for (int i = 0; i < 4; i++) {
			System.out.println("\t\tstringArray[" + i + "]=" + stringArray[i]);
		}
//		}catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("-------catch : = + Service.method()--------");
//		 } finally {
//			System.out.println("------finally : Service.method() ------");
			System.out.println("\t\tService.method()::End");
//		}
 
	
		
	
		

		
	}

}
