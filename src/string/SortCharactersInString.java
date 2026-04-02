package string;

import java.util.Arrays;

public class SortCharactersInString {
	public static void main(String[] args) {
		String str = "rock";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		String result = new String(arr);
		System.out.print(result);
	}

}
