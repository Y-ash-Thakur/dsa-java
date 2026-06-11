package Arrays;

public class buysell {
    public static int buy_and_sell_stokes(int[] prices){
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(buyingPrice < prices[i]){
                int profit = prices[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }

    static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = buy_and_sell_stokes(prices);
        System.out.println(maxProfit);
    }
}
