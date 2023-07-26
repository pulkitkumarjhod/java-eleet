class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n==0)return false;
        if(n==1) return true;
        if(n%2!=0) return false;
        
        return isPowerOfTwo(n/2);
        
        
        
        
        // int i =0;
        // while( n > Math.pow(2,i)){
        //     i++;
        // }
        // if(n == Math.pow(2,i) || n== Math.pow(2,i+1)){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
}