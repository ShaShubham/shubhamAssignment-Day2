package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ListOfCity = Arrays.asList("HongKong" ,"LasVegas", "Mumbai" , "Berlin" , "Tokyo");
		List<String> ListOfSortedCity = ListOfCity.stream().sorted().collect(Collectors.toList());
		
		System.out.println(ListOfSortedCity);

	}

}
