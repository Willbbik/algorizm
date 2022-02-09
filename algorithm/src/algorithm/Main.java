package algorithm;


import java.io.*;
import java.util.Scanner;


public class Main {				
	
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if((n % 7 == 0) || (n % 7 == 2)) {
			System.out.print("CY");
		}else {
			System.out.print("SK");
		}
	}			
}