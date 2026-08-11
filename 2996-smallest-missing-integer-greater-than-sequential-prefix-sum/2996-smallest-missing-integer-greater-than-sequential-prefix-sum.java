class Solution {
    public int missingInteger(int[] nums) {
        int sum =nums[0];
        for(int i = 1;i<nums.length ;i++){
                if(nums[i]==nums[i-1]+1){
                    sum+= nums[i];
                }
                else{
                    break;
                }
                }
                int target =sum;
                while(true){
                    int count =0;
         for(int i = 0;i<nums.length ;i++){
       if(target ==nums[i]){
        count++;
           break;
            }
         }
            if(count ==0) {
               return target;
                }
             target++;
        }
    }
    }

