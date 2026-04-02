package string;

public class StringContainsOnlyDigits {
	public static void main(String[] args) {
		String str = "123a";
		boolean isDigits = str.matches("\\d+");
		
		System.out.print(isDigits);
	}

}
