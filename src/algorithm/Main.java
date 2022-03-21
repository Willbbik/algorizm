package algorithm;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[10];
		int temp = 0;

		for(int i = 0; i < str.length(); i++){
			temp = str.charAt(i) - '0';
			arr[temp] ++;
		}

		int total = arr[6] + arr[9];
		if(total % 2 == 0){
			arr[6] = total / 2;
			arr[9] = total / 2;
		}else{
			arr[6] = total / 2 + 1;
			arr[9] = total / 2 + 1;
		}

		int max = 1;
		for(int i : arr){
			max = Math.max(max, i);
		}
		System.out.println(max);
	}



}
