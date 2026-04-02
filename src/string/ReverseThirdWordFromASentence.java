package string;

public class ReverseThirdWordFromASentence {
	
	public static void main(String[] args) {
	 String sentence = "I Love Java Coding";
		        
		        String[] words = sentence.split(" ");

		       
		        if (words.length >= 3) {
		            String word = words[2];
		            String reversed = "";

		           
		            for (int i = word.length() - 1; i >= 0; i--) {
		                reversed = reversed + word.charAt(i);
		            }

		            
		            words[2] = reversed;
		        }

		      
		        String result = String.join(" ", words);

		        System.out.println(result);
		    	
	       }

}
