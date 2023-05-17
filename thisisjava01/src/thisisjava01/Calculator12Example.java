package thisisjava01;

public class Calculator12Example {
	private int v1;
	private int v2;
	 
	
	public Calculator12Example(int a, int b) {
		v1=a;
		v2=b;
		
   }
	public void plus() {//리턴값이 없음
		System.out.println("plus() :: " + v1 + " + " + v2 + " = ");
	}
	public void minus() {//리턴값이 없어서 void
		System.out.println("minus() :: " + v1+v2);
	}
	public void multiply() {//리턴값이 없어서 void
		System.out.println("multiply() :: " + v1+v2);
	}
	public void divide() {//리턴값이 없어서 void
		System.out.println("divide() :: " + v1+v2);
	}
	public void rest() {//리턴값이 없어서 void
		System.out.println("rest() :: " + v1+v2);
	}
	public void clear() {//리턴값이 없어서 void
		System.out.println("rest() :: " + v1+v2);
	}
	
	
	void printInfo() {
		System.out.println();
	}
	
}







