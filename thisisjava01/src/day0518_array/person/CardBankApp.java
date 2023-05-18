package day0518_array.person;

public class CardBankApp {

	public static void main(String[] args) {
	
		String[] cardRanks;
		
		
		cardRanks = new String[13];
		
		cardRanks[0] = new String("1");
		//문자 객체 만들 때
		cardRanks[1] = new String("2");
		cardRanks[2] = new String("3");
		cardRanks[3] = new String("4");
		cardRanks[4] = new String("5");
		cardRanks[5] = new String("6");
		cardRanks[6] = new String("7");
		cardRanks[7] = new String("8");
		cardRanks[8] = new String("9");
		cardRanks[9] = new String("10");
		cardRanks[10] = new String("Jack");
		cardRanks[11] = new String("Queen");
		cardRanks[12] = new String("King");
		
//		System.out.println("======Card Ranks=====");
//		System.out.println("cardRanks[0] " + cardRanks[0]);
//		System.out.println("cardRanks[1] " + cardRanks[1]);
//		System.out.println("cardRanks[2] " + cardRanks[2]);
//		System.out.println("cardRanks[3] " + cardRanks[3]);
//		System.out.println("cardRanks[4] " + cardRanks[4]);
//		System.out.println("cardRanks[5] " + cardRanks[5]);
//		System.out.println("cardRanks[6] " + cardRanks[6]);
//		System.out.println("cardRanks[7] " + cardRanks[7]);
//		System.out.println("cardRanks[8] " + cardRanks[8]);
//		System.out.println("cardRanks[9] " + cardRanks[9]);
//		System.out.println("cardRanks[10] " + cardRanks[10]);
//		System.out.println("cardRanks[11] " + cardRanks[11]);
//		System.out.println("cardRanks[12] " + cardRanks[12]);
		
		for(int i=0; i<13; i++ ) {
			System.out.println("cardRanks["+i+"] " + cardRanks[i]);
			
		}
	}

}
