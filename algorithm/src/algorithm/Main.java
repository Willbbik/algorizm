package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] a = new int[46];
	static int[] b = new int[46];
	
	public static void main(String[] args) throws Exception {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		int n = Integer.parseInt(br.readLine());

		a[1] = 0;
		b[1] = 1;
		a[2] = 1;
		b[2] = 1;
		
		for(int i = 3; i <= n; i++) {			
			a[i] = a[i-1] + a[i-2];
			b[i] = b[i-1] + b[i-2];			
		}
		
		System.out.println(a[n] + " " + b[n]);
	}	

}