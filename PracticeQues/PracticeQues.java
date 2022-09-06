package pracDay4;

import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Stream;

public class PracticeQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		findAny
		Stream<String> streamFindAny=Stream.of("pizza","pasta","Jalebi","hotdog","brownie");
		Optional<String>result1 =streamFindAny.filter(name -> Character.isUpperCase(name.charAt(0))).findAny();
		System.out.println(result1.get());
		
//		findfirst
		Stream<String> streamFindFirst=Stream.of("pizza","pasta","Jalebi","hotdog","Brownie");
		Optional<String>result2 =streamFindFirst.filter(name -> Character.isUpperCase(name.charAt(0))).sorted().findFirst();
		System.out.println(result2.get());
		
//		anymatch
		Stream<String> streamAnyMatch=Stream.of("pizza","pasta","Jalebi","hotdog","Brownie");
	    boolean result3 = streamAnyMatch.anyMatch(name -> Character.isUpperCase(name.charAt(0)));
		System.out.println(result3);
		 
//		 allmatch
		 Stream<String> streamAllMatch=Stream.of("Pizza","Pasta","Jalebi","Hotdog","Brownie");
		 boolean answer4 = streamAllMatch.allMatch(name -> Character.isUpperCase(name.charAt(0)));
		 System.out.println(answer4);

//		 nonematch
		 Stream<String> streamNoneMatch=Stream.of("pizza","pasta","jalebi","hotdog","brownie");
		 boolean answer5 = streamNoneMatch.noneMatch(name -> Character.isUpperCase(name.charAt(0)));
		 System.out.println(answer5);
		 
//	     Map	 
		 HashMap dataMap = new HashMap();
			dataMap.put(50,"pizza");
			System.out.println(dataMap);
			dataMap.putIfAbsent(50,"jalebi");
			System.out.println(dataMap);
		 
	}

}
