class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        int sum = 0, temp, curr,  diff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            for (int j = i + 1; j < nums.length -1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    temp = nums[i] + nums[j] + nums[k];
                    curr = target > temp ? Math.abs(target- temp) : Math.abs(temp- target);
                    if(diff > curr){
                        diff = curr;
                        sum = temp;
                    }
                }
            }
        }
        return sum;
    }
}