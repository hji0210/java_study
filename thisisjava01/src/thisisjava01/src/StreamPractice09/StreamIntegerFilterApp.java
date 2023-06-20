package StreamPractice09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntegerFilterApp {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("===== Stream.filter() =====");
         
		list.stream().filter(a ->a % 2 == 0).forEach( a -> System.out.print(a + " "));
	 	                   //a를 2로 나누면 나머지  ex)2, 4, 6 ,8, 10을 2으로 나눔,뽑은걸 가져와서 출력
	}

}
