package string;

public class ReverseWordOrderInASentence {
	public static void main(String[] args) {
		
		String sentence= "Java Is Fun";
		String[]words= sentence.split(" ");
		String result = "";
		
		for(int i = words.length- 1; i >= 0; i--) {
			result = result + words[i] + " ";
			
		}
			
		System.out.println(result.toString().trim());	
			
    }

}
