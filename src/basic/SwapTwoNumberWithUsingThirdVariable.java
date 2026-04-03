package basic;

public class SwapTwoNumberWithUsingThirdVariable {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.print("a:"+a);
		System.out.print("b:"+b);
	}

}
