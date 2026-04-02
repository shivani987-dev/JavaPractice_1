package string;

public class FindDuplicateCharacters {
	public static void main(String[] args) {
		String str = "test";
		
		for(int i = 0; i < str.length(); i++) {
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			 
			if(count > 1 && str.indexOf(str.charAt(i))== i) {
				
				System.out.print(str.charAt(i));
			}
		}
	}

}
