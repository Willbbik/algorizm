package algorithm;


import java.io.*;
import java.util.Scanner;


public class Main {				

		
	static int[] arr;
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 2 == 1) {
			System.out.print("CY");
		}else {
			System.out.print("SK");
		}
		sc.close();
	}	
	
}