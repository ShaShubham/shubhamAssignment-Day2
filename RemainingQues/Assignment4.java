package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment4 {
	public static void main(String[] args) {
		
		List<String> citiesList = Arrays.asList("chennai" , "mumbai" , "bangalore","delhi","chicago");
		List<String> resultList = citiesList.stream()
				.map(name -> name.concat("metro")).sorted().collect(Collectors.toList());
		System.out.println(resultList);
	}

}
