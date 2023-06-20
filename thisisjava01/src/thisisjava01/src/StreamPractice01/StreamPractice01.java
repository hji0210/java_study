package StreamPractice01;

import java.util.Set;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.HashSet;

public class StreamPractice01 {

	public static void main(String[] args) {
	  Set<String> set = new HashSet<>();
      set.add("홍길동");
      set.add("신용권");
      set.add("김자바");
      
      Stream<String> stream = set.stream();
      stream.forEach(name-> System.out.println(name));
 	}

}
