class Solution {
    public int maxProfit(int[] prices) {
        
        int leastP= Integer.MAX_VALUE;
        int op = 0;
        int priceToday = 0;
        
        for(int i =0 ; i<prices.length;i++){
            if(prices[i]<leastP){
                leastP=prices[i];
            }
            priceToday = prices[i]-leastP;
            if(op<priceToday){
                op = priceToday;
            }
        }
        return op;
    }
}