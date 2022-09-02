package pracDay2;

import java.util.function.Predicate;

public class AndOrPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> bigger = (mark)-> mark>50;
		System.out.println(bigger.test(100));
		
		Predicate<Integer> smaller = (mark)-> mark<50;
		System.out.println(smaller.test(100));
		
		Predicate<Integer> equalToPredicate = (mark)-> mark==50;
		System.out.println(equalToPredicate.test(100));
		
		System.out.println("and checking"   + bigger.and(equalToPredicate).test(100));
		
		System.out.println("or checking"   + bigger.or(equalToPredicate).test(100));
	}

	}


