class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        if(k>nums.length){
            k=k%nums.length;
        }
        reverse(nums,0,nums.length-1);
        int i=nums.length-k;
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    static void reverse(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}