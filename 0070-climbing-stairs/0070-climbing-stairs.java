class Solution {
    public int climbStairs(int n) {
        // Consider base of n = 1
        if (n == 1) {
            return 1;
        }

        // Initialize the memoization array 
        int[] stepCount = new int[n];
        stepCount[0] = 1;
        stepCount[1] = 2;

        for (int index = 2; index < n; index++) {
            stepCount[index] = stepCount[index - 1] + stepCount[index - 2];
        }

        return stepCount[n - 1];
    }
}