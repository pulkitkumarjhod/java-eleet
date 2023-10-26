class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] ss = s.split(" ");
        if (pattern.length() != ss.length) return false;

        Map<Character, String> hm = new HashMap<>();
        Set<String> hs = new HashSet<>();
        
        for (int i = 0; i < ss.length; i++) {
            char ptrn = pattern.charAt(i);
            if (!hm.containsKey(ptrn)
             && !hs.contains(ss[i])) {
                hs.add(ss[i]);
                hm.put(ptrn, ss[i]);
            }
            else if (
                (!hm.containsKey(ptrn) && hs.contains(ss[i])) 
                || (hm.containsKey(ptrn) && !hs.contains(ss[i]))
                ) return false;
            else if (hm.containsKey(ptrn) && 
                !hm.get(ptrn).equals(ss[i]))
                return false;
        }
        return true; 
    }
}