package Ex;

import java.util.*;

public class q2839 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int kg = Integer.parseInt(scanner.nextLine());
		int t = 0;
		int f = 0;
		int count = 5000;

		
		for(int i=0;i<=(int)kg/3;i++) {
			for(int j=0;j<=(int)kg/5;j++) {
				if(3*i+5*j==kg) {
					if(i+j<count) {
						count = i+j;
					}
				}
			}
			
		}
		
		if(count ==5000) {
			count = -1;
		}
		
		System.out.println(count);
	}

}
