int maxProfit(int* prices, int pricesSize) {
    int cheaper=prices[0];
    int max=0;
    int cur=0;
    for(int i=1;i<pricesSize;i++){
        if(prices[i]<cheaper){
            cheaper=prices[i];
        }
        else{
            cur=prices[i]-cheaper;
            if(max<cur){
                max=cur;
            }
        }
    }
    return max;
}