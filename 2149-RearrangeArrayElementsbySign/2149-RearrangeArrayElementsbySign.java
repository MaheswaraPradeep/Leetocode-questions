class Solution {
    public int[] rearrangeArray(int[] nums) {
        int h=nums.length/2;
        ArrayList<Integer> a=new ArrayList<>(h);
        ArrayList<Integer> b=new ArrayList<>(h);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                a.add(nums[i]);
            }
            else{
                b.add(nums[i]);
            }
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<a.size()&&j<b.size()){
            nums[k]=a.get(i);
            i++;
            k++;
            nums[k]=b.get(j);
            j++;
            k++;
        }
        return nums;
    }
}