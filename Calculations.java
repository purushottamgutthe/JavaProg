package Basic;

import java.util.Scanner;

public class Calculations {
	public static void main(String[] args) {
		int one=0,two=0;
		Scanner scan = new Scanner(System.in);
		
		one = scan.nextInt();
		two = scan.nextInt();
		System.out.print("Addition is: "+(one+two));
		scan.close();
	}
}
