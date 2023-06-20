package StreamPractice05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamPersonApp {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Paige", 20));
		list.add(new Person("James", 30));
		list.add(new Person("Smith", 40));

		System.out.println("===== Stream =====");
		Stream<Person> stream = list.stream();//for문 대신 쓰는것 
		stream.forEach(a-> {
			System.out.print(a + " ");
			a.printInfo();
		});
			

	}

}
