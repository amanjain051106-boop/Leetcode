class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans =new int[2];
         Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
    if(nums[i]== nums[i-1]){
        ans[0] = nums[i];
    }
}
    int  count= 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == count) {
                count++;
            }
        }
        ans[1] = count;
        return ans;
    }
}