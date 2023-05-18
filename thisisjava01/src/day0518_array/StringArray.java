package day0518_array;

public class StringArray {

	public static void main(String[] args) {
		
		String [] stringArray;
		
		
		stringArray = new String[3];
		
		stringArray[0] = new String("Hello");
		stringArray[1] = new String("world");
		stringArray[2] = new String("welcome");
		
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray[1]);
		
		int arrayLength = stringArray.length;
		System.out.println("배열길이=" + arrayLength);
		
		
		for(int i =0; i<stringArray.length; i++) {
			System.out.println("StringArray[" + i + "]");
			System.out.println(stringArray[i]);
		}
		

	}

}
