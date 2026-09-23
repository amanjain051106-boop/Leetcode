class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
             int count= citations.length - i;
            if(citations[i]>=count){
                return count;
            }
        }
        return 0;
    }
}