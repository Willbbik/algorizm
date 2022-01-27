package algorithm;


import java.io.*;
import java.util.Scanner;


public class Main {				
	
	static Integer[] dp = new Integer[1000001];
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		System.out.println(cal(n));		
	}	
	
	static int cal(int N) {
		
		if(dp[N] == null) {
			dp[N] = (cal(N-1) + cal(N-2)) % 15746;
		}
		return dp[N];
	}
	
	
}

