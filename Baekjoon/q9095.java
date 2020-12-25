package Ex;

import java.util.Scanner;

public class q9095 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.nextLine();
		int input;

		int[] arr = new int[12];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int j=4; j<=11;j++) {
			arr[j] = (arr[j-3] + arr[j-2] + arr[j-1]);
		}

		
		for(int i=0;i<n;i++) {		
			input = scanner.nextInt();			
			System.out.println(arr[input]);

		}
		

	}

}
