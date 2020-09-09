package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		q1();
		// q2();
		// q3();
		
	}
	
	public static void q1() {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 1. /와 % 사용해서 자리 숫자를 제어
		// 원래의 숫자에서 일의 자리 숫자(실제 일의 자리)
		System.out.print(num / 1 % 10);
		// 원래의 숫자에서 일의 자리를 제외하고 일의자리 숫자(실제 십의 자리)
		System.out.print(num / 10 % 10);
		// 원래의 숫자에서 십의 자리를 제외하고 일의 자리 숫자 (실제 백의 자리)
		// 이하 동문
		System.out.print(num / 100 % 10);
		System.out.print(num / 1000 % 10);
		System.out.print(num / 10000 % 10);
		System.out.print((num / 100000) % 10);
		System.out.print(num / 1000000);

	}
	
	public static void q2() {
		Scanner sc = new Scanner(System.in);
		
		// 1. 값 입력
		int numNum = sc.nextInt();
		List<String> list = new ArrayList<>();
		
		// 입력 받은 값을 바로 list에 대입
		for (int i = 0; i < numNum; i++) {
			list.add(sc.next());
		}
		
		int order = sc.nextInt();
		
		// 2. 최대 값을 구하는 식
		int flag = 0;
		for (int i = 0; i < list.size(); i++) {
			int max = Integer.parseInt(list.get(0));
			
			for (int j = 0; j < list.size(); j++) {
				int compare = Integer.parseInt(list.get(j));
				if (max <= compare) {
					max = compare;
				}
			}
			flag++;
			
			// 3. order번째로 큰 정수인지를 확인
			if(flag == order) {
				System.out.println(max);
				break;
			}
			
			// 아닐시 최대값을 지우고 다시 fori문으로 돌아간다
			for (int j = 0; j < list.size(); j++) {
				
				int compare = Integer.parseInt(list.get(j));
				if (max == compare) {
					list.remove(j);
					break;
				}
			}
		}
	}
	
	public static void q3() {
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
		String ch2 = sc.nextLine();
		
		// 1. 문자열 입력
		String[] split = ch.split("");
		String[] split2 = ch2.split("");
		List<String> list2 = new ArrayList<>(); 
	
		
		for (int i = 0; i < split2.length; i++) {
			list2.add(split2[i]);
		}
		
		// 2. 첫 번째 문자열을 split잘라서 문자 하나씩 두 번째 문자열과 비교
		for (int i = 0; i < split.length; i++) {
			String criti = split[i];
			
			for (int j = 0; j < list2.size(); j++) {
				// 두 문자열이 같을시 두 번째 문자열을 하나씩 지운다. 
				if(criti.equals(list2.get(j))) {
					list2.remove(j); 
					break;
				}
			}
		}
		
		// 3. 같은 문자열만 있을 시 list2의 길이는 0이므로 경우에 따라 값 출력
		if (list2.size() == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
