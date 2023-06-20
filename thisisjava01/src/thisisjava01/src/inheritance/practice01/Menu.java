package inheritance.practice01;

public class Menu {

     private String menu;
     private int price;
	 public Menu(String menu, int price) {
	   this.menu = menu;
	   this.price = price;
	 
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
    public void printInfo() {
    	System.out.println();
    	System.out.println("====Menu Info====");
    	System.out.print("메뉴=" +  menu + " | ");//한 줄로 올 때 print
    	System.out.println("가격=" +  price );
    }
      
	         
	
}

		


