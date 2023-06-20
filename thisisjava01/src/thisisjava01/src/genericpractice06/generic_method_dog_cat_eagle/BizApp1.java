package genericpractice06.generic_method_dog_cat_eagle;

public class BizApp1 {
	public static void main(String[] args) {
		
		Biz biz = new Biz();
		
		System.out.println("==========명시적 방법=====");
		//매서드명 앞에 타입 지정
		Integer i = biz.<Integer>biz(100);
		System.out.println();
	}
		

}
