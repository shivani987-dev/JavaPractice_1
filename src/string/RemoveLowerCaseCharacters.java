package string;

public class RemoveLowerCaseCharacters {
	public static void main(String[] args) {
		String str = "Hello World";
		String result = str.replaceAll("[a-z]", "");
		
		System.out.print(result);
	}

}
