package StreamPractice07;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {

		System.out.println("===== Java =====");
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}

		System.out.println("\n\n===== Stream =====");
        IntStream intStream = IntStream.range(0, 10);
        intStream.forEach(a->System.out.print(a));


		System.out.println("\n\n----- Method Reference -----");
		 IntStream intStream1 = IntStream.range(0, 10);
	        intStream1.forEach(System.out::print);

	}

}