class Solution {
    public int findMin(int[] nums) {
        return bs(0,nums.length-1,nums);
    }
    private static int bs(int l,int h,int[] nums){
        int min=Integer.MAX_VALUE;
        if(nums[l]<=nums[h]){
            return nums[l];
        }
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            else if(nums[mid]<=nums[h]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        

    }
    return -1;
}}