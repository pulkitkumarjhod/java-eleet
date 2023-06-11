// class Solution {
//     public int maxSubArray(int[] nums) {
//         int cursum=0;
//         int maxsum=0;
        
//         for(int i =0;i<nums.length;i++){
//             cursum=cursum+nums[i];
//             maxsum=Math.max(cursum,maxsum);
            
//             // if(cursum>maxsum){
//             //     maxsum=cursum;
//             // }
//             if(cursum<0){
//                 cursum=0;
//             }
//             if(nums.length==1){
//                 maxsum = nums[0];
//             }
//         }
//         return maxsum;
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
}