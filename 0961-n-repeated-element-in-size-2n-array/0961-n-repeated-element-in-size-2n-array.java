class Solution {
    public int repeatedNTimes(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i <nums.length;i++ ){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int num : nums){
            if( hm.get(num) == nums.length/2){
                return num;
            }
        }
        return -1;
    }
}