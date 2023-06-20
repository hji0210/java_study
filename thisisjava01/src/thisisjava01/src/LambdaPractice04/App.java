package LambdaPractice04;



public class App {

	public static void main(String[] args) {
		
		System.out.println("====== Java =====");
        Sayable s = new Sayable() {
        	public void sayHello(String name) {
        		System.out.println("Hello");
        	}
        };
		s.sayHello("Victoria");
		
		System.out.println("\n=====Lambda ======");
		
		System.out.println("\n------Type 1. ------");
         //매개변수 타입 사용 
		
//		Sayable s1 = new Sayable() {
//			public void sayHello(String name) {
//				System.out.println("Hello" + "," + name);
//				System.out.println("Welcome" + "," + name);
//			}
//		};
		
		
		Sayable s1 = (String name)-> {
				System.out.println("Hello" + "," +  name);
				System.out.println("Welcome" + "," + name);
			
		};
		
	
//		s1.sayHello("Smith");
		s1.sayHello("Smith");

		System.out.println("\n-----Type 2. ------");
		//매개변수 타입 사용x
		Sayable s2 = (name)-> {
			System.out.println("Hello" + "," +  name);
			System.out.println("Welcome" + "," + name);
		
		};
		
	
		s2.sayHello("Paige");
	
		System.out.println("\n-----Type 3. -----");
		//매개변수 타입 사용x
		//실행문 1개인 경우, 실행문 중괄호 생략 가능
		Sayable s3 = (name)-> System.out.println("Hello" + "," +  name);
		
		
		
		s3.sayHello("James");
	}

}
