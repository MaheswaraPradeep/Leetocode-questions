class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        while(n!=1&&n!=89){
            int sum=square(n);
            n=sum;
        }
        if(n==1){
            return true;
        }
        return false;
    }
    static int square(int n){
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum+=r*r;
            n=n/10;
        }
        return sum;
    }
}