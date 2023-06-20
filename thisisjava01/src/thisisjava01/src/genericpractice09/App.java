package genericpractice09;

public class App {
	public static void main(String[] args) {
		
		System.out.println("======GenericP =======");
		System.out.println("-----person -----");
		GenericP<Person> g1 = new GenericP<Person>();
		g1.setField(new Person("paige", 20));
		
		
		System.out.println("\n----- SuperMan----");
		GenericP<SuperMan> g2 = new GenericP<>();
		g2.setField(new SuperMan("Clock",40));
		g2.getField().printInfo();
		
		System.out.println("\n----- GenericFH----");
		System.out.println("----- UFO----");
		GenericFH<UFO> g10 = new GenericFH<UFO>();
		g10.setField(new UFO("쟁반"));
		g10.getField().printInfo();
		g10.getField().hidden();
		
		System.out.println("\n----- SuperMan----");
		GenericP<SuperMan> g11 = new GenericP<SuperMan>();
		g11.setField(new SuperMan("Clock",40));
		g11.getField().printInfo();
		g11.getField().fly();
		g11.getField().hidden();
		
		
		System.out.println("\n---GenericPFH----");
		System.out.println("---UFO----");
		
		System.out.println("\n----- SuperMan----");
		GenericPFH<SuperMan> g21 = new GenericPFH<SuperMan>();
		g21.setField(new SuperMan("Clock",40));
		g21.getField().printInfo();
		g21.getField().fly();
		g21.getField().hidden();
		
	}
	

}
