package collectionFrameWorkpractice06;

public class ArrayList<T> {

	private String menu;
	private int price;
	private int co;
	
	
	public ArrayList(String menu, int price, int co) {
		this.menu = menu;
		this.price = price;
		this.co = co;
	}


	public String getMenu() {
		return menu;
	}


	public void setMenu(String menu) {
		this.menu = menu;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getCo() {
		return co;
	}


	public void setCo(int co) {
		this.co = co;
	}
	
	public ArrayList() {
		System.out.println("1.메뉴=" + menu);
		System.out.println("2.가격=" + price);
		System.out.println("3.재료=" + co);
	}

	
	
	
}

	

