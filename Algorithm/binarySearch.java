package ch07_search;

import java.util.Scanner;

public class binarySearch {
	
	public static int bs(int[] arr, int target, int start, int end) {
		
		if(start>end) {
			return -1;
		}
		int mid = (start+end)/2;
		
		if(arr[mid] == target) {
			return mid;
		}else if(arr[mid]>target){
			return bs(arr, target, start, mid-1);
		}else 
			return bs(arr, target, mid+1, end);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		scanner.nextLine();
		int[] inputArr = new int[n];
		
		for(int i=0;i<n;i++) {
			inputArr[i] = scanner.nextInt();
		}
		int result = bs(inputArr, t, 0, n-1);
		if(result == -1) {
			System.out.println("원소가 존재하지 않음");
		}else {
			System.out.println(result + 1);
		}

	}

}
