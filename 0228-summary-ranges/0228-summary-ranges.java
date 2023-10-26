class Solution {
    public List<String> summaryRanges(int[] nums) {

        if(nums.length == 0) return List.of();

        int left = 0;
        int right = 1;

        List<int[]> ranges = new ArrayList<>();

        while(right<nums.length) {
            if (nums[right] != nums[right - 1] + 1) {
                ranges.add(new int[] {left, right - 1});
                left = right;
            }
            right++; 
        }
        ranges.add(new int[] {left, right - 1});
        
        List<String> res = new ArrayList<>();
        for(int[] arr : ranges) {
            if(arr[0] == arr[1])
                res.add("" + nums[arr[0]]);
            else res.add("" + nums[arr[0]] + "->" + nums[arr[1]]);
        }
        return res;
    }
}