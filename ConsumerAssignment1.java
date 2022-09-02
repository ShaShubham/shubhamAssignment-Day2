package pracDay2;

import java.util.function.Consumer;

public class ConsumerAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> add = (num) -> System.out.println(num+10);
		Consumer<Integer> sub = (num) -> System.out.println(num-10);
		
		add.andThen(sub).accept(20);

	}

}
