package string;

public class RemoveDigitsFromString {
	public static void main(String[] args){
		String str = "Java123";
		String result = str.replaceAll("\\d", "");
		System.out.print(result);
		
	}
	
}
