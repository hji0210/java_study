package OutputStream06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;





public class WriteExample {
	public static void main(String[] args) throws Exception {
		try {
			
			Writer writer = new FileWriter("C:/Temp/test.txt");
			
			char a= 'A';
			writer.write(a);
			char b= 'B';
			writer.write(b);
			
			char[] arr= { 'C', 'D', 'E' };
			writer.write(arr);
			
			writer.write("FGH");
			writer.flush();
			
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
