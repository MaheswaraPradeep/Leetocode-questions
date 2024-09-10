class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);                                         
            if(c=='('){
                if(count>0){
                    res=res+c;
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    res+=c;
                }
            }
        }
        return res;
    }
}