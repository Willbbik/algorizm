package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] dp = new int[11];
	
	public static void main(String[] args) throws Exception {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		int n = Integer.parseInt(br.readLine());
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 4; i <= 10; i++) {			
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];			
		}
		
		for(int i = 0; i < n; i++) {
			
			int m = Integer.parseInt(br.readLine());
			System.out.println(dp[m]);			
		}				
	}	

}