class Solution {
    public boolean isPowerOfTwo(int n) {
        int i =0;
        while( n > Math.pow(2,i)){
            i++;
        }
        if(n == Math.pow(2,i) || n== Math.pow(2,i+1)){
            return true;
        }
        else{
            return false;
        }
    }
}