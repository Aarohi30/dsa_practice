package src;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.print("max profit is : "+result);
        
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=1; i<prices.length; i++){
            int profit = prices[i]-minPrice;
            maxProfit=Math.max(maxProfit, profit);
            minPrice=Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
