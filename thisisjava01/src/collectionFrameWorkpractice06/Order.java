package collectionFrameWorkpractice06;

import java.util.List;

public class Order {

	private List<Menu> menuList;

	public Order(List<Menu> menuList) {
	
		this.menuList = menuList;
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}
	
	
	public void printOrder() {
	   for(int i=0; i< menuList.size(); i++) {
		   System.out.print("\t" + (i + 1) + ".");
		   menuList.get(i).printInfo();
	   } 
	}
	
	
	

}
