package day0518_array;

public class practice {

	public static void main(String[] args) {
	

        int [] intArray; //선언
        intArray = new int[2];//방 만듬
        intArray[0]=1;//방에다가 값 만듬
        intArray[1]=2;//방에다가 값 만듬
       
       System.out.println(intArray[0]);
       System.out.print(intArray[1]);
       
       int arrayLength = intArray.length;
       System.out.println("배열길이=" + arrayLength);
       
       for (int i=0; i < intArray.length; i++) {
    	   System.out.println("intArray [ " + "]");
    	   System.out.println(intArray[i]);
       }
}
     

	}
	
	
	

