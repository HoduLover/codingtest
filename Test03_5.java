package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> time = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
			time.add(sc.nextInt());
		}


		int money = 9000;
		int total = 0;
		int absent = 0;
		int present = 1;
		for (int i = 0; i < time.size(); i++) {

			if (i == 0) {
				if (time.get(i) == 0) {
					total = total + money * time.get(i);
					absent++;
					present = 1;
				} else {
					total = total + money * time.get(i);
					present = 1;
				}
			} else {

				if (time.get(i) == 0) {
					total = total + money * time.get(i);
					absent++;
					present = 1;
				} else if (time.get(i) != 0 && time.get(i - 1) != 0) {
					if (time.get(i) > 8) {

						total = total + (int) (money * (time.get(i) - 8) * Math.pow(1.2, present) * 1.5)
								+ (int) (money * 8 * Math.pow(1.2, present));
						present++;

					} else {

						total = total + (int) (money * time.get(i) * Math.pow(1.2, present));
						present++;

					}
				} else {
					
						total = total + money * time.get(i);
						present++;

					
				}

			}
		}

		if (absent == 0) {
			total = (int) (total * 1.3);
		}

		System.out.println(total);
	}

}
