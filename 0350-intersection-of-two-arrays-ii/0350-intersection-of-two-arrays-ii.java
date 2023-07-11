class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        
        System.out.println(hm);
        
        ArrayList<Integer> a = new ArrayList<>();
        
        
        for(int i =0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i])&& hm.get(nums2[i])!=0){
                hm.put(nums2[i],hm.getOrDefault(nums2[i],0)-1);
                a.add(nums2[i]);
                
            }
        }
        int[] res = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            res[i] = a.get(i);
        }

        return res;
        
    }
}