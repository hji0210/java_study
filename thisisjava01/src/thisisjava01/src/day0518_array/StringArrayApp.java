package day0518_array;

public class StringArrayApp {
	 
	public static void main(String[] args) {
	
     String[] stringArray;
     stringArray = new String[3];
     
     stringArray[0] = new String("Hello");
     stringArray[1] = new String("Wordl");
     stringArray[2] = new String("Welcome");
     
     System.out.println(stringArray[0]);
     System.out.println(stringArray[1]);
     System.out.println(stringArray[2]);
     
     int arrayLength = stringArray.length;
     System.out.println("배열길이=" + arrayLength);
     
    
	
	for(int i=0;i <stringArray.length; i++) {
		System.out.println("stringArray[" + i + "]");
		System.out.println(stringArray[i]);
	}
	}
	}
