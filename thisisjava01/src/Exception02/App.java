package Exception02;

public class App {
	   
		public static void main(String[] args) {
		  try  {       //문제 생기는 코드 넣기
			    System.out.println("==== Object 1======");
				String string1 = "Hello";
				System.out.println(string1.charAt(1));
			
				System.out.println("\n==== Object 2====");
				String string2 = "";
				System.out.println(string2.charAt(1));
			  
			  
			  
			  
		  } catch(StringIndexOutOfBoundsException e)    { 
			  System.out.println("====catch ==== ");
			  
		  }finally {
			  System.out.println("=====finally ====");
		  }
		}
	

}
