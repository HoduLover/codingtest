package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list  = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			if(i == 0) {
				String com1 = sc.next();
				String com2 = sc.next();
				list.add(com1);
				list.add(com2);
			} else if(i == 1){
				String com1 = sc.next();
				String com2 = sc.next();
				
			
				if(list.get(0).equals(com1)) {
					continue;
				} else if(list.get(0).equals(com2)) {
					String tmp1 = com1;
					String tmp2 = list.get(0);
					String tmp3 = list.get(1);
					
					list.set(0, tmp1);
					list.set(1, tmp2);
					list.add(2, tmp3);
				} else if(list.get(1).equals(com1)) {
					String tmp1 = list.get(0);
					String tmp2 = list.get(1);
					String tmp3 = com2;
					
					list.set(0, tmp1);
					list.set(1, tmp2);
					list.add(2, tmp3);
				} else {
					continue;
				}
			} else if(i == 2) {
				String com1 = sc.next();
				String com2 = sc.next();
				
				if(list.size() == 2) {
					if(list.get(0).equals(com1)) {
						continue;
					} else if(list.get(0).equals(com2)) {
						String tmp1 = com1;
						String tmp2 = list.get(0);
						String tmp3 = list.get(1);
						
						list.set(0, tmp1);
						list.set(1, tmp2);
						list.add(2, tmp3);
					} else if(list.get(1).equals(com1)) {
						String tmp1 = list.get(0);
						String tmp2 = list.get(1);
						String tmp3 = com2;
						
						list.set(0, tmp1);
						list.set(1, tmp2);
						list.add(2, tmp3);
					} else {
						continue;
					}
				} else {
					if(list.get(0).equals(com1)) {
						continue;
					} else if(list.get(0).equals(com2)) {
						String tmp1 = com1;
						String tmp2 = list.get(0);
						String tmp3 = list.get(1);
						String tmp4 = list.get(2);
						
						list.set(0, tmp1);
						list.set(1, tmp2);
						list.set(2, tmp3);
						list.add(3, tmp4);
					} else if(list.get(1).equals(com1)) {
						continue;
					} else if(list.get(1).equals(com2)) {
						continue;
					} else if(list.get(2).equals(com1)) {
						String tmp1 = list.get(0);
						String tmp2 = list.get(1);
						String tmp3 = list.get(2);
						String tmp4 = com2;
						
						list.set(0, tmp1);
						list.set(1, tmp2);
						list.set(2, tmp3);
						list.add(3, tmp4);
					} else if(list.get(2).equals(com2)) {
						continue;
					}
				}
			} else {
				String com1 = sc.next();
				String com2 = sc.next();
				
				if(list.get(0).equals(com2)) {
					String tmp1 = com1;
					String tmp2 = list.get(0);
					String tmp3 = list.get(1);
					String tmp4 = list.get(2);
					
					list.set(0, tmp1);
					list.set(1, tmp2);
					list.set(2, tmp3);
					list.add(3, tmp4);
				} else if(list.get(2).equals(com1)) {
					String tmp1 = list.get(0);
					String tmp2 = list.get(1);
					String tmp3 = list.get(2);
					String tmp4 = com2;
					
					list.set(0, tmp1);
					list.set(1, tmp2);
					list.set(2, tmp3);
					list.add(3, tmp4);
				}  else {
					continue;
				}
			}
			
		}
		
		for (int i = 0; i < 4; i++) {
			if (i == 3) {
				System.out.print(list.get(i));
			} else {
				System.out.print(list.get(i) + " ");
			}
		}
	}
}
