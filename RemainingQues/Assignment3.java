package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment3 {
	public static void main(String[] args) {
		
		List<String> citiesList = Arrays.asList("chennai" , "mumbai" , "bangalore","delhi","chicago");
		List<String> alteredList =citiesList.stream().filter(name -> name.contains("ai")).collect(Collectors.toList());
		System.out.println(alteredList);
		
	}
}
