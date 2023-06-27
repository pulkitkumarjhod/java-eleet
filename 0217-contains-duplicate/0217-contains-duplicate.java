import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])>1){
            return true;
            }

        }
        System.out.print(hm);
        
        
        return false;
    }
    
}