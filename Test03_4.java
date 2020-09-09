package codingtest;

import java.util.Scanner;

public class Test03_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String nowtime = sc.nextLine();

		int split1 = Integer.parseInt(date.substring(6, 8));
		int split2 = Integer.parseInt(nowtime.substring(6, 8));
		int result = Math.abs(split1 - split2);

		if (split1 > split2) {
			System.out.println("D-" + result);
		} else if (split1 < split2) {
			System.out.println("D+" + result);
		} else {
			System.out.println("D-0");
		}
	}

}
