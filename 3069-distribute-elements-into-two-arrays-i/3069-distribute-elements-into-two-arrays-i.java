class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 =new int[nums.length];
        int[] arr2 =new int[nums.length];
        int a=0;
        int b=0;
        arr1[a++]= nums[0];
        arr2[b++]= nums[1];
        for(int i=2; i<nums.length;i++){
        if(arr1[a-1] > arr2[b-1]){
          arr1[a++] =nums[i];
        }
        else{
            arr2[b++] =nums[i];
        }
        }
        int[] result = new int[nums.length];
        for(int i =0;i<a;i++){
            result[i] = arr1[i];
        }
            for(int j =0;j<b;j++){
            result[a+j] = arr2[j];
        }
        return result;
    }
}