package string;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String str = "Hi! @Home";
		String result = str.replaceAll("[^a-zA-Z]", "");
		
		System.out.print(result);
	}

}
