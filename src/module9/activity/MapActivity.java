package module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Map;


public class MapActivity {

		public static void main(String[] args) {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("1", "John");
			map.put("2", "Mary");
			map.put("3", "David");
			map.put("4", "Peter");
			map.put("5", "Peter");
			
			print(map);
		}

		static void print(Map map)
		{
			for (Object n : map.keySet()) {
				System.out.println(n + " " + map.get(n));
			}
		}
	}
