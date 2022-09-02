package pracDay2;

import java.util.function.BiPredicate;

public class BiPredicateAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> big = (mark1,mark2)-> mark2>mark1;
		System.out.println(big.test(30,40));
		
		BiPredicate<Integer,Integer> smaller = (mark1,mark2)-> mark2<mark1;
		System.out.println(smaller.test(30,40));
		
		BiPredicate<Integer,Integer> equal = (mark1,mark2)-> mark2==mark1;
		System.out.println(equal.test(30,40));
		
        System.out.println("and  "+ big.and(equal).test(80,80));
		
		System.out.println("or  "+ big.or(equal).test(70,90));

	}

}
