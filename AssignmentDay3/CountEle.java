package AssignmentDay3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		long CountElemets=numbers.stream().count();
		System.out.println(CountElemets);

	}

}
