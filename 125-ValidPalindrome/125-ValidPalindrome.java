class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        if(s.length()<1){
            return true;
        }
       return pal(0,s);
    }
    static boolean pal(int i,String s){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return pal(i+1,s);
    }
}