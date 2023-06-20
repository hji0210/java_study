package cafe.ade;

import cafe.coffee.*; //아이스 아메리카노 사용불가 
import cafe.coffee.ice.IceAmericano;//import는 여러개 가능


public class PackageCoffeeAllApp {
	
	public void main(String[]args) {
		
		System.out.println("====Other Package=======");
		Americano ame = new Americano;
 		ame.printInfo();
 		
 		CafeLatte latte = new CafeLatte();
 		latte.printInfo();
	}
	

}
