class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiple=k;
        for(int i=0;i<=nums.length;i++){
            int count=0;
             for(int j=0;j<nums.length;j++){
            if(nums[j]==multiple){
               count++;
                break;
            }
             }
            if(count==0){
             return multiple;
            }
            multiple+=k;
        }
        return -1;
    }
}