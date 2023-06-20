package inheritance.practice01;

public class Pants extends Clothes{
	 private String type;
	
	public Pants(String product, String color, String company, String type) {
		super(product, color, company);
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
    public void printInfo() {
    	System.out.println();
    	System.out.println("======Pants Info ======");
    	System.out.print("제품명="+  getProduct() );
    	System.out.print(" | 색상=" + getColor());
    	System.out.print(" | 제조사=" + getCompany());
    	System.out.println(" | 바지유형= " + type );
    }
    
}

