package arraypractice0519;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		
		int [][] intArray = new int[2][];// new int [2] [3] : OK new int [][]:error
		intArray[0] = new int[2];//첫 번째 반의 학생수가 3명
		intArray[1] = new int[3];

		intArray[0][0] = 0;
		intArray[0][1] = 1;
		
		intArray[1][0] = 10;
		intArray[1][1] = 11;
		intArray[1][2] = 12;
		
		System.out.println("\n====== intArray[1] =======");
		System.out.println("배열길이=" + intArray[1].length);
		for (int i=0; i< intArray[1].length; i++) {
			System.out.println("intArray[1] [" + i + "]=" + intArray[1][i]);
		}
	
		System.out.println("\n====== intArray ======");
		System.out.println("배열길이=" + intArray.length);
		for (int i=0; i< intArray.length; i++) {
		for (int j=0; i< intArray[i].length; j++) {
		System.out.println("intArray[" + i + "][" + j + "]=" + intArray[i][j]);
		 }
		
		}
	}
}

