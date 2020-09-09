package codingtest;

public class Test05_1 {

	public static void main(String[] args) {
		int priPrice = 3600; // 원가
		int calcProfit = 0; // 예상수익
		int sellingPrice = priPrice; // 판매가
		int amount = 100; // 판매량(임의의 값)
		int maxPrice = priPrice  * 130 / 100; // 판매 최대가
		int minPrice = priPrice  * 70 / 100;  // 판매 최소가
		int maxProfit = priPrice * 9 / 100 * amount; // 원가 최대 수익
		
		// 1.  판매가 증가시 수익률 측정
		boolean flag = true;
		int result = priPrice;
		int count = 1;
		while(flag) {
			sellingPrice = sellingPrice + 100; // 판매가 100원 올림
			amount = 100 * (100 - (5 * count)) / 100; // 5% 감소
			count++;
			if(sellingPrice > maxPrice) {
				flag = false;
				break;
			}
			
			if(amount == 0) {
				flag = false;
				break;
			}
			
			if(sellingPrice < 1000) {
				calcProfit = sellingPrice * 11 / 100 * amount;
			} else if(1000 < sellingPrice && sellingPrice <= 3000) {
				calcProfit = sellingPrice * 10 / 100 * amount;
			} else if(3000 < sellingPrice && sellingPrice <= 5000) {
				calcProfit = sellingPrice * 9 / 100 * amount;
			} else if(3000 < sellingPrice && sellingPrice <= 5000) {
				calcProfit = sellingPrice * 8 / 100 * amount;
			}
			
			if(maxProfit <= calcProfit) {
				maxProfit = calcProfit;
				result = sellingPrice;
			}
			
		}
		
		// 2. 판매가 감소시 수익률 측정
		flag = true;
		sellingPrice = priPrice;
		count = 1;
		while(flag) {
			sellingPrice = sellingPrice - 100; // 판매가 100원 내림
			amount = 100 * (100 + (3 * count)) / 100; // 3% 증가
			count++;
			
			if(sellingPrice < minPrice) {
				flag = false;
				break;
			}
			
			if(sellingPrice < 1000) {
				calcProfit = sellingPrice * 11 / 100 * amount;
			} else if(1000 < sellingPrice && sellingPrice <= 3000) {
				calcProfit = sellingPrice * 10 / 100 * amount;
			} else if(3000 < sellingPrice && sellingPrice <= 5000) {
				calcProfit = sellingPrice * 9 / 100 * amount;
			} else if(3000 < sellingPrice && sellingPrice <= 5000) {
				calcProfit = sellingPrice * 8 / 100 * amount;
			}
			
			if(maxProfit <= calcProfit) {
				maxProfit = calcProfit;
				result = sellingPrice;
			}

		}
		 
		System.out.println("최대 수익은 " + maxProfit); 
		System.out.println("최대 수익 판매가는 " + result);
	}

}
