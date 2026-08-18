class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       int n=nums.length;
        int max=0;
        for(int i=0;i<nums.length;i++){
         int p1 =nums[n-1] *nums[n-2] *nums[n-3] ;
         int p2 =nums[0] *nums[1] *nums[n-1] ;
          max = Math.max(p1,p2);
        }
        return max;
    }
}