package practice0601;

import ScannerPractice03.Manager;

public class App {

	public static void main(String[] args) {
		
		
		Manager manager = new Manager();
		while(whileLoop) {
			try {
				System.out.println("\n======== [메뉴 선택] =========");
				System.out.println("1. 전체 출력");
				System.out.println("2. 등록");
				System.out.println("3. 수정");
				System.out.println("4. 삭제");
				System.out.println("5. 조회(성별)");
				System.out.println("6. 조회(나이 구간)");
				System.out.println("9. 종료");
				System.out.println("메뉴를 선택하세요 = >");
				String menu = sc.nextLine();
				
				
				switch(menu) {
				case "1" : 
				System.out.println("[전체 출력]");
				manager.printPersonList();
				break;
				case "2" :
				System.out.println("[등록]");
				manager.addPerson(sc);
				break;
				case "3" : 
				System.out.println("[수정]");
				manager.updatePerson(sc);
				case "4" : 
			    System.out.println("[삭제]";
			    manager.
			    
				
				
				
				
				
				}
				
				
			}
		}
		
		
		
		

	}

}
