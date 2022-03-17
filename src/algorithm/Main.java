package algorithm;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			
			String str = sc.next();
			if(check(str)) {
				cnt ++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	static boolean check(String str) {
		
		boolean[] check = new boolean[26]; 
		int prev = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				
				//  미사용
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;					
				}else {
					return false;
				}
				
			}else {
				continue;
			}						
		}
		return true;
	}
	
	
}
