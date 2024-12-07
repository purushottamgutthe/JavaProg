package Basic;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int[] store = new int[2000];
		System.out.print("Enter Number:");
		num = scan.nextInt();
		int counter=0;
		while(num>0) {
			store[counter]=num%2;
			num/=2;			
			counter++;
		}
		for (int j=counter;j>=0;j--) {
			System.out.print(store[j]);
		}
		scan.close();
	}
}
