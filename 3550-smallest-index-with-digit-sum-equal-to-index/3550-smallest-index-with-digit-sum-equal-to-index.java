class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int org = nums[i]; 
            int sum =0;
            while(org>0){
                sum = sum + org%10;
                org =org/10;
            }
            if(sum==i){
                return i;
        }
        }
        return -1;
    }
}