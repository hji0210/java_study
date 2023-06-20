package anonymouspractice02;

public class App {

	public static void main(String[] args) {
//		System.out.println("===Object======");
//		Character archer = new Archer();
//		archer.attack();
//		
//		System.out.println("\n=======Anonymous object =====");
//		Character c1 = new Character() {
//			
//			@Override
//			public void attack() {
//				System.out.println("원거리 공격");
//			}
//		};
//		c1.attack();
		
		System.out.println("\n===라이플맨 =====");
		Character c4 = new Character("제임스", "라이플맨") {
			
		@Override
		public void attack() {
			System.out.println("소총 공격");
		}
		
	};
    c4.printInfo();
    c4.attack();
    game.attack(c4);
}

