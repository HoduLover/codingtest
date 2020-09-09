package codingtest;

import java.util.Scanner;

public class Test03_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		if(a.contains("!")) {
			int pac = Integer.parseInt(a.replaceAll("!", "").trim());
			
			int result = pac(pac);
			
			for (int i = pac; i > 0; i--) {
				if(i > 1) {
					System.out.print(pac + "x" );
					pac -= 1;
				} else {
					System.out.print(pac);
					pac -= 1;
				}
			}
			System.out.println(" = " + result);
		}
		
		if(a.contains("P")) {
			String p = a.replaceAll("P", "").trim();
			String[] split = p.split("");
			int num1 = Integer.parseInt(split[0]);
			int num2 = Integer.parseInt(split[1]);
			int range = num1 - num2;
			
			int result = pac2(num1, num2);
			
			for (int i = num1; i >  range; i--) {
				if(i > range + 1) {
					System.out.print(num1 + "x" );
					num1 -= 1;
				} else {
					System.out.print(num1);
					num1 -= 1;
				}
			}
			System.out.println(" = " + result);
		}
		
		if(a.contains("C")) {
			String c = a.replaceAll("C", "").trim();
			String[] split = c.split("");
			int num1 = Integer.parseInt(split[0]);
			int num2 = Integer.parseInt(split[1]);
			int range = num1 - num2;
			
			int result = cPac(num1, num2);
			
			System.out.print("(");
			for (int i = num1; i >  range; i--) {
				if(i > range + 1) {
					System.out.print(num1 + "x" );
					num1 -= 1;
				} else {
					System.out.print(num1);
					num1 -= 1;
				}
			}
			System.out.print(")");
			System.out.print("/");
			System.out.print("(");
			for (int i = num2; i >  0; i--) {
				if(i > 1) {
					System.out.print(num1 + "x" );
					num1 -= 1;
				} else {
					System.out.print(num1);
					num1 -= 1;
				}
			}
			System.out.print(")");
			
			System.out.println(" = " + result);
		}

	}
	
	public static int pac(int a) {
		if(a == 1) {
			return 1;
		} else {
			return a * pac(a - 1);
		}
	}
	
	public static int pac2(int a, int b) {

		if(a == 1 || b == 0) {
			return 1;
		} else {
			return a * pac2(a - 1, b - 1);
		}
	}
	
	public static int cPac(int a, int b) {

		if(a == 1 || b == 0) {
			return 1;
		} else {
			return a * cPac(a - 1, b - 1) / b;
		}
	}
	
	

}
