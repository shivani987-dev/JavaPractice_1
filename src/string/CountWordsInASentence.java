package string;

public class CountWordsInASentence {
	public static void main(String[] args) {
		String sentence = "Keep it simple";
		String[] words = sentence.split(" ");
		
		int count = words.length;
		System.out.println(count);
	}

}
