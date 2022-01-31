package algorithm;


import java.io.*;
import java.util.Scanner;


public class Main {				
	// baekjoon 2491
		
	static int[] arr;
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		int count = 1;	
		int count2 = 1;
		int max = 1;
		arr = new int[n];
		
		// 값 받기
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}		
				
		// 오름차순		
		for(int i = 0; i<n-1; i++) {
			if(arr[i] <= arr[i+1]) count++;
			else count = 1;
			max = Math.max(max, count);
		}
		
		// 내림차순		
		for(int i = 0; i<n-1; i++) {
			if(arr[i] >= arr[i+1]) count2++;
			else count2 = 1;
			max = Math.max(max, count2);
		}
		
		System.out.println(max);
	}	
	
}