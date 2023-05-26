package inheritance.practice05;

public class Game {
   
	public void attack(Character character) {
		if(character instanceof Archer) {
			System.out.println("[" + character.getName() + " / " + character.getCharacter() + "] " + "원거리 공격");
		}else if (character instanceof Knight) {
			System.out.println("[" + character.getName() + " / " + character.getCharacter() + "] " + "근거리 공격");
		}
		
	}
	
}
