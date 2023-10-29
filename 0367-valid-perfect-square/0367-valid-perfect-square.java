class Solution {
    public boolean isPerfectSquare(int num) {
        long i = 0; long j = num;
        while(i <= j) {
            long mid = i + (j-i)/2;
            if(mid*mid > (long)num) j = mid-1;
            else if(mid*mid < (long)num) i = mid+1;
            else return true;
        }
        return false;
    }
}