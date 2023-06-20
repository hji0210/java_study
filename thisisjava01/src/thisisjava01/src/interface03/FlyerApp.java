package interface03;

import practice0522.Airplane;

public class FlyerApp {
 
	public static void main(String[] args) {
	
	
	System.out.println("====Human ======");
	Animal human = new Human(29,"James");
	human.printInfo();
//	human.eat();
	
	System.out.println("\n====== Bird =====");
	Bird bird = new Bird(5,2);
 	bird.printInfo();
//	bird.eat();
//	bird.takeoff();
//	bird.land();
//	bird.fly();
	
//	System.out.println("\n====== SuperMan =====");
//	SuperMan superman = new SuperMan(30,"Song");
//	superman.printInfo();
//	superman.eat();
//	superman.takeoff();
//	superman.land();
//	superman.fly();
//	
//	System.out.println("\n====== Airplane =====");
//	Airplane air = new Airplane();
//	air.load();
//	air.takeoff();
//	air.fly();
//	air.land();
//	air.unload();
//	
//	

	}
}
