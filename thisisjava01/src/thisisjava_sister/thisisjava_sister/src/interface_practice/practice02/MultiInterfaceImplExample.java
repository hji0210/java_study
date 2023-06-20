package interface_practice.practice02;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		
		searchable.search("https://www.youtube.com");

	}

}
