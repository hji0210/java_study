package StreamPractice10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamStringFilterApp {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Paige", "James", "Smith", "Tom", "Victoria");


		// - "a" 가 포함되어 있는 문자열 출력
		
		list.stream()
		.filter( n  -> n.contains("a"))//
		.forEach(n->System.out.print(n + " "));
		System.out.println();

 

		// - 시작문자 : P, 종료문자 : e, 길이 : 5이상 문자열 출력
		// - 여러 조건은 && 로 연결

         list.stream()
         .filter(n -> n.startsWith("P")&& n.endsWith("e")&& n.length() >=5) 
         .forEach(n -> System.out.print(n + " "));
	}

}