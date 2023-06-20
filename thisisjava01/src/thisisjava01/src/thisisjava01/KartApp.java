package thisisjava01;

public class KartApp {

	public static void main(String[] args) {
	      
		
		Kart kart = new Kart("버스트", "Green");
		
		System.out.println("===== READY =====");
		kart.printKartInfo();
		
		System.out.println("\n===== RUN =====");
		kart.speedUp();
		kart.speedUp();
		kart.pickBooster();
		kart.pickBooster();
		kart.useBooster();
		kart.useBooster();
		kart.speedDown();
		kart.speedDown();
	}

}
