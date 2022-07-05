
public class StockBuySell {

	
	//Method 1
	public static int maxProfit(int[] price, int start, int end) {
		if(end<=start) return 0;
		
		int profit =0;
		for(int i=start;i<end;i++) {
			for(int j=i+1;j<=end;j++) {
				if(price[j]>price[i]) {
					int currProfit =price[j]-price[i] + maxProfit(price, start, i-1) +
							maxProfit(price, j+1, end);
					profit = profit>currProfit? profit : currProfit;
				}
			}
		}
		return profit;
	}
	
	//Method 2:
	public static int maxProfitsecond(int[] price) {
		
		int profit=0;
		
		for(int i=1;i<price.length;i++) {
			if(price[i]>price[i-1]) {
				profit += price[i]-price[i-1];
			}
		}
		return profit;
	}
}
