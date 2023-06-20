package collectionFrameWorkpractice06;

public class Coffee extends Menu{
    private String bean;
    
	public Coffee(String name, int price, String bean) {
		super(name, price);
		this.bean = bean;
	}

	
	public String getBean() {
		return bean;
	}

	public void setBean(String bean) {
		this.bean = bean;
	}
	
	
	@Override
	public void printInfo(){
	    System.out.print("메뉴=" +  getName() + " | ");//한 줄로 올 때 print
    	System.out.print("가격=" +  getPrice() + " | ");
    	System.out.println("원두=" +  bean);
	}
}
    

