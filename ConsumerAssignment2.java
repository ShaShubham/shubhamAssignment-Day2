package pracDay2;

import java.util.function.Consumer;

public class ConsumerAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Consumer<String>consumer=(name) -> System.out.println(name.toUpperCase());
	    
	     Consumer<String> consumerDemo=(name) -> System.out.println(name.length());

	     consumer.andThen(consumerDemo).accept("shubham");
	      

	}

}
