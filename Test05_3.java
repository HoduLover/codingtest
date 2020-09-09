package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test05_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> priceList = new ArrayList<>();
		List<Integer> amountList = new ArrayList<>();

		int num = sc.nextInt();
		int totalPrice = 0;
		int limit = 100000;
		int remain = 0;
		for (int i = 0; i < num; i++) {
			priceList.add(sc.nextInt());
			amountList.add(sc.nextInt());
		}

		for (int i = 0; i < priceList.size(); i++) {
			totalPrice = totalPrice + priceList.get(i) * amountList.get(i);
		}

		remain = limit - totalPrice;
		int min = 1000000000;
		int result = 0;
		for (int i = 0; i < priceList.size(); i++) {
			if (remain <= priceList.get(i)) {
				int compare = Math.abs(priceList.get(i) - remain);
				if (min >= compare) {
					min = compare;
					result = priceList.get(i);
				}
			}
		}

		int minNum = 0;
		int compare = 0;
		for (int i = 0; i < priceList.size(); i++) {
			min = priceList.get(0);
			compare = priceList.get(i);
			if (min >= compare) {
				min = compare;
				minNum = i;
			}
		}

		int mount = remain / priceList.get(minNum) + 1;
		if (result != 0) {
			System.out.println(totalPrice + " " + result);
		} else {
			System.out.println(totalPrice);
			System.out.println(minNum + 1 + " " + mount); 
		}
	}

}
