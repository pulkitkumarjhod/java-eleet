class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, maxFound = 0;
        while(l < r){
           maxFound = Math.max(maxFound, (Math.min(height[l], height[r]) * (r - l)));
            l += height[l] < height[r] ? 1 : (r-- > 0 ? 0 : 0);
        }
        return maxFound;
    }
}