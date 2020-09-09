package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> list = new ArrayList<>(); 
		
		double s1 = sc.nextDouble();
	
		double s3 = sc.nextDouble() * 1000;

		
		if(s1 == s3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
			System.out.println(s1);
			System.out.println(s3);
		}
		
		/*
		 * Double max = list.get(0); String result = "1"; for (int i = 1; i <
		 * list.size(); i++) { Double compare = list.get(i); if(max < compare) { max =
		 * compare; result = Integer.toString(i + 1); } }
		 * 
		 * System.out.println(result);
		 */
	}
}
