class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       int sum1=0;
       int sum2=0;
        for(int i=0;i<aliceSizes.length;i++){
            sum1+= aliceSizes[i];
        }
         for(int j=0;j<bobSizes.length;j++){
            sum2+= bobSizes[j];
        }
        int diff= (sum1-sum2)/2;
          for(int i=0;i<aliceSizes.length;i++){
           for(int j=0;j<bobSizes.length;j++){
            if(diff == aliceSizes[i]- bobSizes[j]){
                return new int[]{ aliceSizes[i], bobSizes[j]};
            }
           }
          }
        return new int[]{};
    }
}