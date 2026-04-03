package basic;

public class SwapTwoNumberWithoutUsingThirdVariable {
	public static void main(String[] args) {
		int a = 20, b = 10;
		
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 
		System.out.print("a:"+a);
		System.out.print("b:"+b);
		
	}

}
