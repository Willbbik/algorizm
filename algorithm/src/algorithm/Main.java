package algorithm;


import java.io.*;
import java.util.Scanner;


public class Main {				
	
	static int[][] arr;	
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		arr = new int[n+1][n+1];
		arr[1][1] = 1;
		
		for(int i = 2; i <= n; i++) {
			
			arr[i][1] = 1;
			for(int j = 1; j < n; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
			arr[i][n] = 1;
		}
		
		System.out.println(arr[n][k]);
	}			

}