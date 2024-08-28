class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(h.containsKey(rem)){
                res[0]=i;
                res[1]=h.get(rem);
                return res;
            }
            h.put(nums[i],i);
        }
        return res;
    }
}