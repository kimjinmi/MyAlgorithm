package Ex;

import java.util.*;

public class q1712 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] splitline = input.split(" ");
		int A = Integer.parseInt(splitline[0]);
		int B = Integer.parseInt(splitline[1]);
		int C = Integer.parseInt(splitline[2]);
		int saleAll = 0;
		int costAll = 0;
		int breakEvenPoint = 0;

		if(B<C) {
			for(int i=0;(A/(C-B))>i;i++) {
				breakEvenPoint++;
			}
			breakEvenPoint = breakEvenPoint+1;
		}else {
			breakEvenPoint = -1;
		}
		
		System.out.println(breakEvenPoint);
		
		
		
	}

}
