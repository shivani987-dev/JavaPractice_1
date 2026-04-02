package string;

public class RemoveSpecificCharacter {
	public static void main(String[] args) {
		String str = "Cloud";
		char remove = 'u';
		String result = str.replace(String.valueOf(remove), "");
		
		System.out.print(result);
	}

}
