package module9.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.

		Set<String> names = new HashSet<String>();
		names.add("John");
		names.add("Mary");
		names.add("David");
		names.add("Peter");
		names.add("Peter");

		print(names);
		
	}
	
	static void print(Set set)
	{
		for (Object o : set) {
			System.out.println(o);
		}
	}
}
