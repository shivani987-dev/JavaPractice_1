package string;

public class RemoveUpperCaseCharacters {
	public static void main(String[] args) {
		String str = "Hello World";
		String result = str.replaceAll("[A-Z]", "");
		
		System.out.print(result);
	}

}
