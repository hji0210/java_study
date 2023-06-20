package ScannerPractice04;

import java.util.*;


public class MenuApp {
	
	List<Menu> menuList = new ArrayList<>();
	
	public void addMenu(Scanner scan) {
		System.out.println("[메뉴 추가]");
		System.out.println("메뉴번호를 입력하세요 =>");
		int number = Integer.parseInt(scan.nextLine());
		System.out.println("메뉴 카테고리를 입력하세요(커피, 에이드, 케이크) = >");
		String kind = scan.nextLine();
		System.out.println("메뉴명을 입력하세요  = > ");
		String menuName = scan.nextLine();
		System.out.println("가격을 입력하세요  = > ");
		int price = Integer.parseInt(scan.nextLine());
		
		
		Menu menu = new Menu(number, kind, menuName, price);
		menuList.add(menu);
	}

	public void selectMenu() {
		for(int i=0; i< menuList.size(); i++) {
			System.out.print(menuList.get(i).getNumber() +  " . " );
			System.out.print(menuList.get(i).getKind() + " : ");
			System.out.print(menuList.get(i).getMenuName() + " ");
			System.out.println(menuList.get(i).getPrice() + "(원)");
		}
		
	}

	public void updateMenu(Scanner scan) {
		System.out.println("[메뉴 수정]");
		System.out.println("메뉴번호를 입력하세요 = > ");
		int number = Integer.parseInt(scan.nextLine());
		System.out.println("메뉴 카테고리를 입력하세요(커피, 에이드, 케이크) = >");
		String kind = scan.nextLine();
		System.out.println("메뉴명을 입력하세요  = > ");
		String menuName = scan.nextLine();
		System.out.println("가격을 입력하세요  = > ");
		int price = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<menuList.size(); i++) {
		  if(menuList.get(i).getNumber() == number) {
			  Menu menu = menuList.get(i);
			  menu.setKind(kind);
			  menu.setMenuName(menuName);
			  menu.setPrice(price);
			  break;
		  } 
		}
	}

	public void deleteMenu(Scanner scan) {
		System.out.println("[메뉴 삭제]");
		System.out.println("메뉴번호를 입력하세요 = > ");
		int number = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<menuList.size(); i++) {
			 if(menuList.get(i).getNumber() == number) {
				 menuList.remove(i);
				 break;
			 }
			}
		
	}
	    
	
	
	
	
	
	
}
