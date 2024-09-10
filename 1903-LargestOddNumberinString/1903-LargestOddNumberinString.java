class Solution {
    public String largestOddNumber(String num) {
        int s=num.length()-1;
        StringBuilder sb=new StringBuilder();
        while(s>=0){
            int n=num.charAt(s)-'0';
            if(n%2!=0){
                sb.append(num.substring(0,s+1));
                return sb.toString();
            }
            s--;
        }
        return "";
    }
}