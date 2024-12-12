class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new  HashSet<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            while(h.contains(s.charAt(j))){
                h.remove(s.charAt(i));
                i++;
            }
            h.add(s.charAt(j));
            max=Math.max(max,j-i+1); 
            j++;
        }
        return max;
    }
}
