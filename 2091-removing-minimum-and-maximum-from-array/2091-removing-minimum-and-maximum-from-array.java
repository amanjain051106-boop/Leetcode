class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0; 
        int max=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]<nums[min]){
            min =i;
           }
        }
           for(int i=0;i<nums.length;i++){
           if(nums[i]>nums[max]){
            max =i;
           }
           }
           int l =Math.min(min,max);
             int r =Math.max(min,max);
             int a =r+1; //from left side remove
             int b= nums.length-l;  //from right side remove
             int c= l+1+ nums.length-r; //from both side remove
              return Math.min(a,Math.min(b,c));
    }
}