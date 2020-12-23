package Ex;

import java.util.*;

public class q1316 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String[] line = new String[N]; 
		
		
		for(int i=0;i<N;i++) {
			line[i] = scanner.nextLine();	
		}
		
		for(int i=0;i<N;i++) {
			String word = line[i];
			for(int j=0;j<word.length();j++) {
				//int[] wordindex
				int index = word.indexOf(word.charAt(j));
				if(index != -1) {
					while(index == -1) {
						//int
						//word = word.substring(index+1);
						
					}
			}
				
			}
			
			
		}
		
		
	}

}
