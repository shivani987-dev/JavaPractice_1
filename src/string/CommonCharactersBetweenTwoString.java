package string;

import java.util.HashSet;

public class CommonCharactersBetweenTwoString {
	public static void main(String[] args) {
		String str1 = "thin";
		String str2 = "thick";
		
		HashSet<Character> set1 = new HashSet<>();
		HashSet<Character> result = new HashSet<>();
		
		for(char ch : str1.toCharArray()) {
			set1.add(ch);
		}
		for(char ch : str2.toCharArray()) {
			if(set1.contains(ch)) {
				result.add(ch);
			}
		}
		System.out.print(result);
	}

}
