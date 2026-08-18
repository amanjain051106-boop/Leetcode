class Solution {
    public int largestInteger(int[] nums, int k) {
        int max =-1;
         if(k==nums.length){                 //case1
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
            return max;
        }
        if(k==1){                       //case2
            for(int i=0;i<nums.length;i++){
                int count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]== nums[j]){
                        count++;
                    }
            }
            if(count==1){
            max = Math.max(max,nums[i]);
            }
            }
            return max;
        }
        // case 3 i<k<nums.length
        for(int i=0;i<nums.length;i++){
        if(i==0 || i==nums.length-1){
            int count=0;
            for(int j=0;j<nums.length;j++){
                    if(nums[i]== nums[j]){
            count++;
        }
        }
        if(count==1){
         max = Math.max(max,nums[i]);
            }
        }
        }
            return max;  
    }
}