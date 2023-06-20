package Exception05;


public class App {
	
	public static void main(String args[]) {

		System.out.println("App.main()::Start");
		try {
		Control c = new Control();
		c.method();		
		} catch (ArrayIndexOutOfBoundsException e) {;
	        System.out.println("------catch : Main.main()---");

	    }finally { 
	    	System.out.println("------finally : Main.main()---");
	      System.out.println("App.main()::End");
	    }
}
}