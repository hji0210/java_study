package practice20;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton () {}
	
	public static Singleton getIncetance() {
		return singleton;
	}
}