package algorithm;


import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;


public class Main {			

	static BigInteger[] dp;
	
	public static void main(String[] args) throws IOException {
								
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		
		if(n == 0) {
			System.out.println(0);			
		}else if(n == 1) {
			System.out.println(1);			
		}else {
			dp = new BigInteger[n + 1];
			
			dp[0] = BigInteger.ZERO;
			dp[1] = BigInteger.ONE;		
			
			System.out.println(cal(n));
		}
				
	}
	
	
	static BigInteger cal(int N) {
		
		if(dp[N] == null) {		
			dp[N] = cal(N - 1).add(cal(N - 2));			
		}
		
		return dp[N];		
	}

}

