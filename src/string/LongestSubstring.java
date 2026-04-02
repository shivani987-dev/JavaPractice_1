package string;

import java.util.HashSet;

public class LongestSubstring {
	public static void main(String[] args) {
		
		String str = "abcabcbb";
		HashSet<Character> set = new HashSet<>();
		
		int i = 0, maxLength = 0;
		String result = "";
		for(int j = 0; j < str.length(); j++) {
			while
				(set.contains(str.charAt(j))) {
				set.remove(str.charAt(i));
				i++;
			}
				set.add(str.charAt(j));
				
				if(j - i + 1 > maxLength) {
					maxLength = j - i + 1;
					
					result = str.substring(i, j + 1);
			}
			
		}
		System.out.print(result);
	}

}
