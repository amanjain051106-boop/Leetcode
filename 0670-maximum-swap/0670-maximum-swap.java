class Solution {
    public int maximumSwap(int num) {
         // Number → Array
       String s = String.valueOf(num);
       int[] arr =new int[s.length()];
       for(int i=0 ;i<s.length();i++){
        arr[i]=s.charAt(i)-'0';
       }
         // swap
       for(int i=0;i<arr.length;i++){
        int max=i;
        for(int j=i+1;j<arr.length;j++){
             if(arr[j]>=arr[max]){
                 max=j;
             }
             }
            if(arr[max]>arr[i]){
                int temp= arr[i];
                arr[i]= arr[max];
                arr[max]= temp;
                break;
            }
       }
         // Array → Number
       int ans=0;
       for(int i=0;i<arr.length;i++){
        ans =ans*10+ arr[i];
    }
    return ans;
    }
}