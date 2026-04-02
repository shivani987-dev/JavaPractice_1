package string;

public class CountVowelsandConsonants {
	public static void main(String[] args) {
		
		String str = "Automation".toLowerCase();
		int vowels = 0;
		int consonants = 0;
		
		
		for(int i = 0; i < str.length(); i++) {
			char ch =str.charAt(i);
			

			if(Character.isLetter(ch)) {
				if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowels++;
					
				}else { 
					consonants++;
					
				}
				
			}
		}
		
	
	System.out.println("vowels: " + vowels);
	
	System.out.println("consonants: " + consonants);

    } 
	
}
