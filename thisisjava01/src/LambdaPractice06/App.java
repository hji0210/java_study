package LambdaPractice06;

import LambdaPractice02.Sayable;

public class App {
	
public static void main(String[] args) {
 System.out.println("=====Java =====");
    Sayable s = new Sayable() {
    	public void sayHello(String name) {
    		System.out.println("Hello");
    	}
    };
    
    s.sayHello("Victoria");
	
    
    System.out.println("\n===== Lambda ======");
	
    System.out.println("\n------ Type 1. -------");
    //매개변수 타입 사용
    
    
    
    
    s1.sayHello("Smith");
    
    System.out.println("\n-----Type 2. -----");
    //매개변수 타입 사용 x
    
    s2.sayHello("Pagie");
    
    System.out.println("\n---- Type3. -----");
    //매개변수 타입 사용x
    //실행문 1개일 경우, 실행문 중괄호 생략 가능
    
    
    
    s3.sayHello("James");
    
    
    
}



	

}
