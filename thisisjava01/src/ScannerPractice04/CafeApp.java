package ScannerPractice04;

import java.util.Scanner;

public class CafeApp {

	MenuApp menuApp = new MenuApp();
	
	public void begin() {

		Scanner scan = new Scanner(System.in);

		boolean member = true;
		while (member) {

			System.out.println();
			System.out.println("######## Cafe app #########");
			System.out.println("1.메뉴 관리");
			System.out.println("2.주문 관리");
			System.out.println("9.종료");
			System.out.print("메뉴를 선택하세요=>");
			String menu = scan.nextLine();

			switch (menu) {
			case "1":
				System.out.println("[메뉴 관리]");
				showMenu(scan);
				break;
			case "2":
				System.out.println("[주문 관리]");
//				showOrder(scan);
				break;
			case "9":
				System.out.println("[종료]");
				member = false;
				break;

			}

		}

		System.out.println("[프로그램 종료]");
		scan.close();

	}

	public void showMenu(Scanner scan) {
		System.out.println("showMenu()");

		boolean member = true;
		while (member) {

			System.out.println();
			System.out.println("======== [메뉴 관리] ========");
			System.out.println("1.메뉴 조회");
			System.out.println("2.메뉴 추가");
			System.out.println("3.메뉴 수정");
			System.out.println("4.메뉴 삭제");
			System.out.println("9.종료");
			System.out.print("메뉴를 선택하세요=>");
			String menu = scan.nextLine();

			switch (menu) {
			case "1":
				System.out.println("[메뉴 조회]");
				menuApp.selectMenu();
				break;
			case "2":
				System.out.println("[메뉴 추가]");
				menuApp.addMenu(scan);
				break;

			case "3":
				System.out.println("[메뉴 수정]");
				menuApp.updateMenu(scan);
				break;

			case "4":
				System.out.println("[메뉴 삭제]");
				menuApp.deleteMenu(scan);
				break;

			case "9":
				System.out.println("[종료]");
				member = false;
				break;

			}

		}
		
	}
		
//		public void showOrder(Scanner s) {
//			System.out.println("showMenu()");
//
//			boolean member = true;
//			while (member) {
//
//				System.out.println();
//				System.out.println("======== [주문 관리] ========");
//				System.out.println("1.메뉴 조회");
//				System.out.println("2.주문");
//				System.out.println("3.주문 조회");
//				System.out.println("9.종료");
//				System.out.print("메뉴를 선택하세요=>");
//				String order = s.nextLine();
//
//				switch (order) {
//				case "1":
//					System.out.println("[메뉴 조회]");
//					selectMenuOrder();
//					break;
//				case "2":
//					System.out.println("[주문]");
//					order();
//					break;
//
//				case "3":
//					System.out.println("[주문 조회]");
//					selectOrder();
//					break;
//
//				
//				case "9":
//					System.out.println("[종료]");
//					member = false;
//					break;
//
//				}
//		
//	}
//		}
	
		
	}