package module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Mary");
		names.add("David");
		names.add("Peter");
		names.add("Peter");
		//2 - Call print method to print the list passed as its parameter.
		print(names);
		
	}
	
	static void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
