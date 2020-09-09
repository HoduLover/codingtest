package codingtest;

import java.util.Scanner;

public class Test05_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divide1 = sc.nextInt();
		int divide2 = sc.nextInt();
		
		boolean flag = true;
		int value1 = num;
		int remain1 = 0;
		int count1 = 0;
		
		while(flag) {
			remain1 = value1 % divide1;
			value1 =  value1 / divide1;	
			
			if(remain1 == 0) {
				count1++;
			}
			if(value1 < divide1) {
				flag = false;
			}
			
		}
		
		flag = true;
		int value2 = num;
		int remain2 = 0;
		int count2 = 0;
		
		while(flag) {
			remain2 = value2 % divide2;
			value2 =  value2 / divide2;	
			
			if(remain2 == 0) {
				count2++;
			}
			if(value2 < divide2) {
				flag = false;
			}
			
		}
		
		if(count1 > count2) {
			System.out.println("결과 : " + divide1 + " > " + divide2);
		} else if(count1 < count2) {
			System.out.println("결과 : " + divide1 + " < " + divide2);
		} else {
			
		}
	}

}
