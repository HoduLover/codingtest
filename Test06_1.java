package codingtest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		System.out.println("1. 소수");
		System.out.println("2. 최대공약수");
		System.out.println("3. 최소공배수");

		
		int choice = sc.nextInt();
		// 1. 소수 구하기
		if(choice == 1) {
			int a = sc.nextInt();
			
			int count = 0;
			for (int i = 2; i < a + 1; i++) {
				for (int j = 2; j < a + 1; j++) {
					if(i % j == 0) {
						count++;
					}
				}
				
				if(count == 1) {
					list.add(i);
				}
				count = 0;
			}
			
			for (int i = 0; i < list.size(); i++) {
				if(i == list.size() -1) {
					System.out.println(list.get(i));
				} else {
					System.out.print(list.get(i) + " ");
				}
			}
		}
		// 2. 최대공약수 구하기 
		
		if(choice == 2) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			BigInteger b1 = BigInteger.valueOf(b);
			BigInteger b2 = BigInteger.valueOf(c);
			BigInteger gcd = b1.gcd(b2);
			System.out.println(gcd.intValue());
		
		}
		// 3. 
		
		if(choice == 3) {
			int d = sc.nextInt();
			int e = sc.nextInt();
			
			BigInteger c1 = BigInteger.valueOf(d);
			BigInteger c2 = BigInteger.valueOf(e);
			BigInteger gcd2 = c1.gcd(c2);
			System.out.println((d * e) / gcd2.intValue());
		
		}
	}
}
