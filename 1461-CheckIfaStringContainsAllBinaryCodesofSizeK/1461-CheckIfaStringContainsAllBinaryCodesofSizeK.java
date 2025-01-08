class Solution {
    public boolean hasAllCodes(String s, int k) {
        int res=(int)Math.pow(2,k);
        int i=0;
        int j=k;
        int c=0;
        HashSet<String> h=new HashSet<>();
        while(j<=s.length()){
            String a=s.substring(i,j);
            if(h.contains(a)==false){
                h.add(a);
                c++;
            }
            i++;
            j++;
        }
        if(c>=res){
            return true;
        }
        else{
            return false;
        }
    }
}