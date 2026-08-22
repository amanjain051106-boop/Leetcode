class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=1;
        int count=1;
        if(nums.length==0){
            return 0;
            }
        for(int i=1;i<nums.length;i++){
            if(nums[i]== nums[i-1]+1){
                count++;
            }
                else if(nums[i]==nums[i-1]){ // for duplicate
                    continue;// it helps to move to next i
                }
            else{
                count=1;
                }
        
        max =Math.max(max ,count);
        }
        return max;
    }
}