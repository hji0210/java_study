package interface06;

public class CarApp {

	public static void main(String[] args) {
		
		System.out.println("==== Sedan =====");
		Sedan s1 = new Sedan("k5");
		s1.getOn();
		s1.getOff();
		
	System.out.println("\n=====Truck =====");
        Truck t1 = new Truck("마이티");
        t1.load();
        t1.unload();
        
       System.out.println("\n======Suv ======");
         Suv suv = new Suv("싼타페");
         suv1.getOn();
         suv1.getoff();
         suv1.load();
         suv1.unload();
	}

}
