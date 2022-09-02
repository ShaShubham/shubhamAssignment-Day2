package pracDay2;

import java.util.function.Predicate;

public class predicateCheckLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Predicate<String> str=(name) -> name.length()>3;
		System.out.println(str.test("shubham"));
	}

}
