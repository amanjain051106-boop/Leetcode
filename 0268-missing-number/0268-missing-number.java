class Solution {
    public int missingNumber(int[] nums) {
        int maxValue =nums[0];
        int minValue =nums[0];
           Arrays.sort(nums);
           for(int i =0;i<nums.length;i++){
            maxValue =  Math.max(nums[i],maxValue);
            minValue =  Math.min(nums[i],minValue);
           }
           if (minValue > 0) {
            return 0;
        }
          for(int i =minValue+1;i<maxValue;i++){
            int count =0;
             for(int j =0;j<nums.length;j++){
                if( nums[j] ==i){
                    count++;
                }
                }
                if(count ==0){
               return i;
                }
             }
         return nums.length;
    }
}