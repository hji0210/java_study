package genericpractice06.generic_method_dog_cat_eagle;

public class BizApp {

	public static void main(String[] args) {
	
		
		System.out.println("====== Class : new Biz<Cat>(new Cat())");
		Biz<Cat> bizCat = new Biz<Cat>(new Cat());
		Cat cat = bizCat.getT();
		cat.printInfo();
		
		System.out.println("\n ----- Method : biz(new Eagle()-------");
		Eagle eagle1= bizCat.biz(new Eagle());
		eagle1.printInfo();
	}

}
