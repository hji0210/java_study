package ch12.sec08;


         import java.text.*;
         import java.util.*;

import javax.xml.crypto.Data;
         
         public class DataExample {	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
        Data now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow);
        
        SimpleDateFormat sdf = new simpleDateFormat("yyyy.MM.dd.HH:MM:ss");
        String strNow2= sdf.format(now);
        System.out.println(strNow2);
	}

}
