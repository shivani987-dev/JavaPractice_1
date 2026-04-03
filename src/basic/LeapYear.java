package basic;

public class LeapYear {
	public static void main(String[] args) {
		int year = 2005;
		
		if(year % 4 ==0) {
			
			if(year % 100 == 0) {
			
			if(year % 400 == 0) {
				System.out.print("leap year");
			}
			
			else {
				System.out.print("not a leap year");
			}
			
		}
			else {
				System.out.print("leap year");
			}
			
		}
		else {
			System.out.print("not a leap year");
		}
	}

}
