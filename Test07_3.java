package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test07_3 {

	public static void main(String[] args) {
		
		q3();

	}

	public static void q1() {
		// 1. 구구단
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int j = 9; j > 0; j--) {
			System.out.println(a + " X " + j + " = " + a * j);
		}
	}

	public static void q2() {
		// 2. 별찍기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 1; i < a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = a; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void q3() {
		// 3. 암호화
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		String a = sc.next();
				
		String[] split = a.split("");
		
		for (int i = 0; i < split.length; i++) {
			char s = split[i].charAt(0);
			int num = (int) s;
			System.out.print(num);
		}
		
	}
}
