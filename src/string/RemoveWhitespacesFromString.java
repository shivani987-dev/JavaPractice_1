package string;

public class RemoveWhitespacesFromString {
	public static void main(String[] args) {
		String str ="J a v a";
		String result = str.replaceAll("\\s", "");
		System.out.print(result);
	}

}
