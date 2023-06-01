package ScannerPractice04;

public class Menu {
	
	private int number;
	private String kind;
	private String menuName;
	private int price;
	
	
	
	
	
	
	
	public Menu(int number, String kind, String menuName, int price) {
		this.number = number;
		this.kind = kind;
		this.menuName = menuName;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
