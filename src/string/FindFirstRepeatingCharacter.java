package string;

public class FindFirstRepeatingCharacter {
	public static void main(String[] args) {
		String str = "apple";
		
		
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
				System.out.print(str.charAt(i));
				break;
			}
				
				
	    }
	}

}
