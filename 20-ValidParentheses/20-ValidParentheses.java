class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> h=new HashMap<>();
        h.put(')','(');
        h.put(']','[');
        h.put('}','{');
        for(char c: s.toCharArray()){
            if(h.containsKey(c)){
                if(!stack.isEmpty()&&stack.peek()==h.get(c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
