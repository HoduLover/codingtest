package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		q2(a , b);
		
	}
	
	
	public static void q1() {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			String  s = sc.nextLine();
		}
		
	}
	
	
	public static void q2(int a, int b) {
		int count = 0;
		
		q2(a, b);
		
		if (count == 0) {
		
			int result = 0;
			for (int i = a; i < a - b; i--) {
				System.out.print(i);
				result = result + i;
				if(i == a - b -1) {
					continue;
				} else {
					System.out.print(" + ");
				}
			}
			
			System.out.print(" = " + result);
			count++;
		}
	}
	
	
	

}


