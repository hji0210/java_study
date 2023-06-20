package thisisjava01;

public class Kart {
	private String name;
	private String color;
	private int speed;
	private int boosterCnt;
	
	private int speedUp = 40;
	private int speedDown = 80;
	private int maxSpeed = 150;
	private int boosterSpUp = 100;
	private int maxBoostCnt = 1;
	private String dan = "(km)";
	
	// 생성자는 return이 없다. 만들고 끝
	public Kart(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void printKartInfo() {
		System.out.println("===== Kart Info =====");
		System.out.println("["+this.name+"("+this.color+")]");
		System.out.println("SpeedUp : " + this.speedUp + dan);
		System.out.println("SpeedUp : " + this.speedDown + dan);
		System.out.println("SpeedUp : " + this.maxSpeed + dan);
		System.out.println("SpeedUp : " + this.boosterSpUp + dan);
		System.out.println("SpeedUp : " + this.maxBoostCnt +"(ge)");
	}
	
	public void speedUp() {
		String gamtansa = "";
		
		this.speed += this.speedUp;
		if(this.speed > maxSpeed) {
			this.speed = 150;
		}
		gamtansa = this.speed > 100 ? "wow very speedy!" : "very slow";
		
//		if(this.speed>100) {
//			gamtansa = "wow very speedy!";
//		}else {
//			gamtansa = "very slow";
//		}
		
		System.out.println(gamtansa);
		System.out.println("["+this.name+"("+this.color+")] speedUp | sokdo : " + this.speed + " | booster : " + this.boosterCnt);
	}
	
	public void speedDown() {
		this.speed -= this.speedUp;
		if(this.speed < 0) {
			this.speed = 0;
		}
		System.out.println("["+this.name+"("+this.color+")] speedUp | sokdo : " + this.speed + " | booster : " + this.boosterCnt);
	}

	public void pickBooster() {
		// TODO Auto-generated method stub
		
	}

	public void useBooster() {
		// TODO Auto-generated method stub
		
	}
}
