class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        List<Integer>[] l=new List[nums.length+1];
        for(int i=0;i<l.length;i++){
            l[i]=new ArrayList<>();
        }
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> m : h.entrySet()){
            l[m.getValue()].add(m.getKey());
        }
        int[] res=new int[k];
        int index=0;
        for(int i=l.length-1;i>0&&index<k;i--){
            for(int n:l[i]){
                res[index++]=n;
                if(index==k){
                    return res;
                }
            }
        }
        return res;
    }
}