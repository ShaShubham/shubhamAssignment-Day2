package pracDay2;

import java.util.function.BiConsumer;

public class BiConsumerAssignmentInt {
	public static void main(String[] args) {
	
		   BiConsumer<Integer,Integer> bcl=(x,y) -> System.out.println(x+y);
	        bcl.accept(10, 20);
	        
	        BiConsumer<Integer,Integer> bc2=(x,y) -> System.out.println(x-y);
	        bc2.accept(20, 10);
	        
	        bcl.andThen(bc2).accept(20, 10);
	
	}
}
