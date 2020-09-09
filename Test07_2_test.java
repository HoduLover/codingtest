package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test07_2_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int a = sc.nextInt();

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

	}
}
