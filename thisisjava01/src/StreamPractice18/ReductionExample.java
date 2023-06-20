package StreamPractice18;

import java.util.Arrays;
import java.util.List;

import StreamPractice15.Student;

public class ReductionExample {

	public static void main(String[] args) {
	List<Student> studentList = Arrays.asList(
		    new Student("홍길동", 92),
		     new Student("신용권", 95),
		     new Student("유미선", 88)
	
			);
	
	int sum1 = studentList.stream()
               .mapToInt(Student :: getScore)
               .sum();
	
	
	int sum2 = studentList.stream()
               .map(Student :: getScore)
               .reduce(0, (a,b) -> a+b);
	
	System.out.println("sum1: " + sum1);
	System.out.println("sum2: " + sum2);

	}

}
