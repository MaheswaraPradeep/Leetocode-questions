class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=nums[0];
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            if(count==0){
                ele=nums[i];
            }
            if(cur==ele){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }
}