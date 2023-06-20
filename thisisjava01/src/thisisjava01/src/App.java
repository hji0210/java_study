
public class App {

	public static void main(String[] args) {
		System.out.println("===Object======");
		Character archer = new Archer();
		archer.attack();
		
		System.out.println("\n=======Anonymous object =====");
		Character c1 = new Character() {
			
			@Override
			public void attack() {
				System.out.println("원거리 공격");
			}
		};
		c1.attack();
		

	}

}
