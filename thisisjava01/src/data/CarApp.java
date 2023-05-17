package data;

public class CarApp {

	public static void main(String[] args) {
		String companyName = "Audi";
		String address = "독일";
		String phone = "123-4567";
		Company company = new Company(companyName, address, phone);
		company.printInfo();
		
		System.out.println("\n======Car Info========");
		String name="A6";
		String color="Red";
		int door=4;
		int maxSpeed=300;
		
		Car c = new Car(name, company, color, door, maxSpeed);
		c.printInfo();

	}

}
