class Solution {
    public boolean checkDivisibility(int n) {
        int original =n;
       int  digit =0;
       int sum =0;
       int prod=1;
        while(n>0){
             digit = n%10;
             sum +=digit;
             prod *=digit;
        n=n/10;
        }
        if(original%(sum+prod) ==0){
            return true;
        }
        return false;
    }
}