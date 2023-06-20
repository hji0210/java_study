package Genericpractice02;

public class App {

	public static void main(String[] args) {
   Biz<Integer>biz1 = new Biz<Integer>();//integer생략가능
   biz1.setData(10);
   System.out.println(biz1.getData());
		
   Biz<String>biz2 = new Biz<String>();
   biz2.setData("hello");
   System.out.println(biz2.getData());
   
   Biz<String>biz3 = new Biz<>();//생성자는 타입을 생략 할수 있다.
   //변수와 동일한 타입으로 생성자를 호출할 수있다.
   biz3.setData("world");
   System.out.println(biz3.getData());
   

	}

}
