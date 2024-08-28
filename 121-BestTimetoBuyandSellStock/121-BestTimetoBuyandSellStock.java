class Solution {
    public int maxProfit(int[] prices) {
        int cheap=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<cheap){
                cheap=prices[i];
            }
            else{
                int profit=prices[i]-cheap;
                max=Math.max(max,profit);
            }
        }
        return max;
    }
}