package codingtest;

import java.util.Scanner;

public class Test07_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int calcA = 100 - a;
		int calcB = 100 - b;
		
		int first = 100 - (calcA + calcB);
		int second = calcA * calcB;
		
		System.out.println(100 + "-" + a + " " + 100 + "-" + b);
		System.out.println(calcA + "   +   " + calcB + "    ->" + (calcA + calcB));
		System.out.println(calcA + "   X   " + calcB + "         ->" + second);
		System.out.println("앞 두자리 : " + 100 + "-" + (calcA + calcB) + " = " + first);
		System.out.println("뒤 두자리 : " + second); 
		System.out.println("결론 : " + first + second);
	}

}
