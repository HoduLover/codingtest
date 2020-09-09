package codingtest;

import java.util.Scanner;

public class Test05_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		String[] split = sentence.split("");
		
		int hCount = 0;
		int eCount = 0;
		int lCount = 0;
		int oCount = 0;
		int result = 0;
		
		for (int i = 0; i < split.length; i++) {
			if(split[i].equals("H")) {
				hCount++;
			} else if(split[i].equals("e")) {
				eCount++;
			} else if(split[i].equals("l")) {
				lCount++;
			} else if(split[i].equals("o")){
				oCount++;
			} else {
				continue;
			}
		}
		
		boolean flag = true;
		while(flag) {
			if(hCount >= 1 && eCount >= 1 && lCount >= 2 && oCount >= 1) {
				result++;
				hCount = hCount - 1;
				eCount = eCount - 1;
				oCount = oCount - 1;
				lCount = lCount - 2;
			}
			
			if(hCount == 0 || eCount == 0 || lCount == 1 || lCount == 0 || oCount == 0) {
				flag = false;
			}
		}
		
		System.out.println(result);
	}

}
