package Day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		cities starting with "c" count
		List<String> citiesList = Arrays.asList("chennai" ,"", "mumbai" , "bangalore","delhi","chicago","chennai");
		long result = citiesList.stream().filter(name -> name.startsWith("c")).count();
		System.out.println(result);
		
		
//		print cities in forEach
		citiesList.stream().forEach(x-> System.out.println(x));
		
		
//		distinct elements
		 List<String> resultList = citiesList.stream().distinct().collect(Collectors.toList());
			System.out.println(resultList);
			
			
//      count empty string			
		long emptyList = citiesList.stream().filter(name -> name.isEmpty()).count();
		System.out.println(emptyList);
		

//		sum of range 
		System.out.println(IntStream.range(1, 26).sum());	
		
			
	}

}
