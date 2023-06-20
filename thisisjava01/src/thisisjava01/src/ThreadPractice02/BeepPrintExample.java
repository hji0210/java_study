package ThreadPractice02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
    Thread thread = new Thread() {
    	       @Override
               public void run() {
				Toolkit toolkit =Toolkit.getDefaultToolkit();  
				for(int i=0; i<5; i++) {
					System.out.println("웅");
					try {
						Thread.sleep(500);//일을 o.5씩 쉼
					 } catch(Exception e) {//오류가 생기면 다시 작성
					 
   			}
   		}
   }
    };	

            thread.start();
            
				for(int i=0; i<5; i++) {
					System.out.println("띵");
					try {
						Thread.sleep(500);
					}catch(Exception e) {
				}
			}
		}
}
	 

	

