package LambdaPractice02;

public class App {
	
	public static void main(String[] args) {
		
		
		System.out.println("====== Java =====");
		Sayable s = new Sayable() {//익명객체
				@Override 
				public void sayHello() {
			    System.out.println("Hello");
		}

};
    s.sayHello();
    
	System.out.println("\n====== Lambda =====");

	System.out.println("\n----- Type 1. ------");
    //실행문 2개
	Sayable s1 = ()->{
		System.out.println("Hello");
		System.out.println("Welcome");
		
	 };

	
	s1.sayHello();
	
	
	System.out.println("\n---- Type 2. ----");
	//실행문 1개
	Sayable s2 = ()->{
		System.out.println("Hello");
	
	 };

	
	
	s2.sayHello();
	
	System.out.println("\n---- Type 3. ----");
	//실행문 1개, 중괄호 삭제
	
	Sayable s3 = ()->
		System.out.println("Hello");
	
	 

	
	s3.sayHello();
	
	
	}
}