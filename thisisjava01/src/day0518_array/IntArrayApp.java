package day0518_array;

public class IntArrayApp {

	public static void main(String[] args) {
		
		//Declaration
		int[] intArray;//배열은 참조타입
		//int 기본타입 
		
		//Creation
		intArray = new int[2];//범위는 0,1 공간만 만듬
		
		//Initialization
		intArray[0]=1;
		intArray[1]=2;
		
		//Output
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		
		//Output : length
		int arrayLength = intArray.length;//이 배열의 길이는 2 
		System.out.println("배열길이=" + arrayLength);
		
		for (int i=0; i<intArray.length; i++) {
			System.out.println("intArray[" + i + "]");
			System.out.println(intArray[i]);
		}
		
	}

}
