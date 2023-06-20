package interface05;

public class CastingExampld {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();

	}

}
