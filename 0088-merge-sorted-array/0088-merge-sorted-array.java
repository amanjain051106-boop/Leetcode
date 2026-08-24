class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result =new int[m+n];
        int a=0;
        for(int i=0;i<m;i++){
            result[a] =nums1[i];
            a++;
        }
        for(int i=0;i<n;i++){
            result[a] =nums2[i];
            a++;
        }
        Arrays.sort(result);
         for(int i=0;i<result.length;i++){
           nums1[i] =result[i];
         }
    }
}