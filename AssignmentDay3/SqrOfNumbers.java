package AssignmentDay3;

import java.util.Arrays;
import java.util.List;

public class SqrOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		numbers.stream().distinct().forEach(x -> System.out.println(x*x));

	}

}