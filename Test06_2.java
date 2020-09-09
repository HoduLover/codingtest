package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		List<Integer> findNum = new ArrayList<>();
		
		int order = sc.nextInt();
		
		for (int i = 0; i < 8; i++) {
			list.add(1);
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(5);
			list.add(8);
			list.add(13);
			list.add(21);
		}
		
		// 1. 소수 구하기
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 2; j < list.get(list.size() - 1) + 1; j++) {
				if(list.get(i) != 1 && list.get(i) % j == 0) {
					count++; 
				}
			}
			
			if(count == 1) {
				findNum.add(list.get(i));
			}
			count = 0;
		}
		
		
		for (int i = 0; i < order; i++) {
			if(i == findNum.size() - 1) {
				System.out.print(findNum.get(i));
			} else {
				System.out.print(findNum.get(i) + " ");
			}
		}
		
	}

}
