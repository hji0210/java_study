package collectionFrameWorkpractice06;

public class Ade extends Menu {
      
          private String material;
          
		public Ade(String name, int price, String material) {
		   super(name, price);
	       this.material = material;
		}
		

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}
          
		public void printInfo() {
			System.out.print("메뉴=" + getName());
			System.out.print("|가격=" + getPrice()  );
			System.out.println("|재료=" + material );
		}
          
	
}
