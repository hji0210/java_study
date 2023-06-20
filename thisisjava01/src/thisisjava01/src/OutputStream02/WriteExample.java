package OutputStream02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		OutputStream os = null;
	try {
		os = new FileOutputStream("C:/Temp/test2.db");
		
		byte[] array = {10, 20, 30 };
		
		os.write(array);
		
		os.flush();
		os.close();
	} catch(IOException e) {
		e.printStackTrace();
	} finally {
		// releases all system resources from the streams
		try {
			if (os != null) {
				os.close();
			}
		} catch (IOException e) {
			System.out.println("\n===== finally() :  IOException  =====");
			e.printStackTrace();
		}
	}
}

}	
		
	


