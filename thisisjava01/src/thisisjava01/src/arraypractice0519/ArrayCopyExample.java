package arraypractice0519;

public class ArrayCopyExample {

	public static void main(String[] args) {
	    //길이가 3인 배열
		String[] oldstrArray = { "java", "array", "copy" };
		//길이 5인 배열을 새로 생성
		String[] newstrArray = new String[5];
		//배열 항목 복사
		System.arraycopy( oldstrArray, 0, newstrArray, 0, oldstrArray.length );
		//배열 항목 출력
		for(int i=0; i<newstrArray.length; i++) {
			System.out.print(newstrArray[i] + ", ");
		}
	}
        
}
