package module9.sample;
//Needs to be completed
import java.util.*;

public class SetSample {
	public static void main(String[] args) {
		//1 - Create a new HashSet and name it monthSet
		HashSet<String> monthSet = new HashSet<String>();
		//2 - Add duplicate month names in it. For eg. January can be entered twice
		//duplicates will return false
		monthSet.add("January");
		monthSet.add("February");
		monthSet.add("March");
		monthSet.add("April");
		monthSet.add("May");
		monthSet.add("June");
		monthSet.add("July");
		monthSet.add("August");
		monthSet.add("September");
		monthSet.add("October");
		monthSet.add("November");
		monthSet.add("December");
		//System.out.println(monthSet.add("January"));
		System.out.println(monthSet);
		System.out.println(monthSet.size());
		monthSet.remove("January");
		System.out.println(monthSet);

		System.out.println("Output : ");
		for (String s : monthSet) {
			System.out.println(s);
		}

		//3 - Iterate through the HashSet and print all the months.


		//You'd notice that duplicate names are not printed. 
	}
}
