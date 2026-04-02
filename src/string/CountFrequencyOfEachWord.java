package string;

import java.util.HashMap;

public class CountFrequencyOfEachWord {
	public static void main(String[] args) {
		String str = "cat dog cat";
		String[] words = str.split(" ");
		
		 HashMap<String, Integer> map = new HashMap<>();
		  
		 for(String word : words) {
			 map.put(word, map.getOrDefault(word, 0) + 1);
		 }

		 System.out.print(map);
	}

}
