package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test07_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int a = sc.nextInt();
		int r1 = 0;
		int r2 = 0;

		int first = a / 100;
		int second = a % 100;

		int calcFirst = 100 - first;

		int multiResult = a;
		int plusResult = 200 - calcFirst;

		double b = 0 - plusResult;
		double c = multiResult;

		double disc = b * b - 4.0 * c;
		double sqr = Math.sqrt(disc);
		
		r1 = (int) ((-b + sqr) / 2.0);
		r2 = (int) ((-b - sqr) / 2.0);

		if (a / 1000 == 0) {
			for (int i = 10; i < 101; i++) {
				for (int j = 10; j < 101; j++) {
					if (i * j == a) {
						list1.add(i);
						list2.add(j);
					}
				}
			}
			if (list1.size() % 2 == 0) {
				for (int i = 0; i < list1.size() / 2; i++) {
					System.out.println(list1.get(i) + " X " + list2.get(i) + " = " + a);
				}
			} else {
				for (int i = 0; i < list1.size() / 2 + 1; i++) {
					System.out.println(list1.get(i) + " X " + list2.get(i) + " = " + a);
				}
			}
		} else {
			System.out.println(a);
			System.out.println(100 + " - " + first + "    ->    " + (100 - r1) + " + " + (100 - r2));
			System.out.println("         " + second + " ->    " + (100 - r1) + " X " + (100 - r2));
			System.out.println("             " + 100 + "-" + r1 + "   " + 100 + "-" + r2);
			System.out.println(r1 + " X " + r2 + " = " + a);
		}
	}

}
