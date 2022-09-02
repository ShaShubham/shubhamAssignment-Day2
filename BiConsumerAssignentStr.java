package pracDay2;

import java.util.function.BiConsumer;

public class BiConsumerAssignentStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String , String> str = (x,y) -> System.out.println(x + y);
		str.accept("Shubham", " Sharma");

	}

}
