class Solution {
    public int lengthOfLongestSubstring(String s) {
//         HashMap<Character,Integer> hm = new HashMap<>();
//         int count = 0;
//         StringBuilder sb = new StringBuilder();
        
//         for(int i = 0; i<s.length();i++){
//             int strcount = 0;
//             int j = i;
//             while(!sb.toString().contains(String.valueOf(s.charAt(j)))&& j <s.length())
//             {
//                 sb.append(s.charAt(j));
//                 j++;
//                 strcount++;
//             }
//             count = Math.max(count,strcount);
            
//         }
//         System.out.println(sb.toString());
//         return count;
         HashMap<Character, Integer> hm = new HashMap<>();
        int count = 0;
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (hm.containsKey(c)) {
                int lastIndex = hm.get(c);
                count = Math.min(count + 1, i - lastIndex);
            } else {
                count++;
            }
            
            hm.put(c, i);
            maxLength = Math.max(maxLength, count);
        }
        
        return maxLength;
        
        
    }
}