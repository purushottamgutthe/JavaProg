import java.util.Scanner;

public class TargetInArray {

	public static void main(String[] args) {
		int[] arr= new int[5];
		int[][] pairs = new int[5][5];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an array values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the target: ");
		int target=scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				if(arr[i]+arr[j]==target) {
					if(i!=j){
						pairs[0][0]=i;
						pairs[0][1]=j;
					}
					break; 
				}
			}
		}
		System.out.println(pairs[0][0]+" "+ pairs[0][1]);
		scan.close();
	}
} //file is working as expected