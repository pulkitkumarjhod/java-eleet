class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       int n = nums.length;
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        
        for(int i =0 ; i<n; i++){
            int size = arr.size();
            for(int j =0 ; j<size ; j++){
                List<Integer> x = new ArrayList<>(arr.get(j));
   
                x.add(nums[i]);
                arr.add(x);
                
            }
        }
        return arr;
        
        
        
        
        
        
        // for(int i =0 ; i<n ;i++){
        //     int i = nums[i];
        //     arr.add(x);
        //     while(i<n){
        //         y = nums[i]","nums[i+1];                                            arr.add(y);
        //     }
        // }
        // return arr;
    }
}