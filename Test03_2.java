package codingtest;

import java.util.Scanner;

public class Test03_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aNum = sc.nextInt();
		int bNum = sc.nextInt();
		
		int result = calc(aNum, bNum);
		
		for (int i = aNum; i > aNum - bNum; i--) {
			if(i == aNum - bNum + 1) {
				System.out.print( i + " = " + result);

			} else {
				System.out.print(i + " + ");
			}
		}
		
	}
	
	public static int calc(int a, int b) {
		if(a == 1 || b == 0) {
			return 0;
		} else {
			return a + calc(a - 1, b - 1);
		}
	}
	
}
