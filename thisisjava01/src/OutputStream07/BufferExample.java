package OutputStream07;


import java.io.*;

public class BufferExample {

	public static void main(String[] args) throws Exception {
		
		
		String originalFilePath1 = "C:/Temp/originalFile1.jpg";//파일 만듬
		
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";//읽어서 가져옴
				FileInputStream fis = new FileInputStream(originalFilePath1);
				FileOutputStream fos = new FileOutputStream(targetFilePath1);
				
				String originalFilePath2 = "C:/Temp/originalFile2.jpg";//파일 만듬
				
				String targetFilePath2 = "C:/Temp/targetFile2.jpg";//읽어서 가져옴
				
				
				
				FileInputStream fis2 = new FileInputStream(originalFilePath2);//읽어옴
				FileOutputStream fos2 = new FileOutputStream(targetFilePath2);//읽어와서 targetFilePath2에 저장
			    BufferedInputStream bis = new BufferedInputStream(fis2);//성능향상
			    BufferedOutputStream bos = new BufferedOutputStream(fos2);//성능향상
				
			    
			    
			    long nonBufferTime  = copy(fis, fos);
			    System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");
			    
			    long bufferTime  = copy(bis, bos);
			    System.out.println("버퍼 사용:\t" + bufferTime + " ns");
			    
			    fis.close();
			    fos.close();
			    bis.close();
			    bos.close();
	}
			  
			    public static long copy(InputStream is, OutputStream os) throws Exception {
			    	long start = System.nanoTime();
			    	while(true) {
			    		int data =is.read();
			    		if(data == -1) break;//데이터를 보내
			    		os.write(data);//if(data == -1) break아니면 빠져나가
			    	}
			    	os.flush();
			    	long end = System.nanoTime();
			    	return(end-start);
			    	}
	
}
			
			    


