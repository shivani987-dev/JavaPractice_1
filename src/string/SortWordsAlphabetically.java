package string;

import java.util.Arrays;

public class SortWordsAlphabetically {
	public static void main(String[] args) {
		String str = "Mango Apple Banana";
		String[] words = str.split(" ");
		Arrays.sort(words);
		
		String result = String.join(" ", words);
		System.out.print(result);
	}

}
