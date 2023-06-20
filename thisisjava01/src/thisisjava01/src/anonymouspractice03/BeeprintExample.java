package anonymouspractice03;

import java.awt.Toolkit;

public class BeeprintExample {

	public static void main(String[] args) {
		Toolkit toolkit =Toolkit.getDefaultToolkit();  
		for(int i=0; i<5; i++) {
			System.out.println("웅");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
		}
		}
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
		}
	}
}
			
			
	}


