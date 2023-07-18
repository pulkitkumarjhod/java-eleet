class Solution {
    public int characterReplacement(String s, int k) {
        // sabse phle hashmap bana rha hu taki pta chal jayer konsa jyadad baar aayega kam vale ko replace kr denge
        HashMap<Character,Integer> hm = new HashMap<>();
        int res =0; // kyuki min length 0 rhti 
        int l=0;
        for(int i = 0;i<s.length(); i++){
            
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            
            while( (i-l+1) - Collections.max(hm.values()) >k){
                hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            res = Math.max(res,i-l+1);
            
        }
        System.out.print(hm);
        
       return res; 
        
    }
}