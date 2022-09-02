package Assignment;

import java.util.List;
import java.util.function.BiPredicate;

public class Assignment1 {
	
	static List<Person> personList = PersonRepository.getAllPersons();
	 
	static BiPredicate<Integer,String> HeightOfPerson = (height,gender)-> height>50&&gender=="Male";
	

	private static void fetchHeight() {
		personList.forEach(per->{
			
		if(	HeightOfPerson.test(per.getHeight(),per.getGender())) {
			System.out.println(per);
		}
			
		});
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			fetchHeight();

	}

}
