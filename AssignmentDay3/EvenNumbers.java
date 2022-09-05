package AssignmentDay3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> EvenNum=numbers.stream().filter(x -> x%2==0).collect(Collectors.toList());
		System.out.println(EvenNum);
		
		
		
	}

}
