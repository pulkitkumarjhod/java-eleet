class Solution {
        public  boolean canConstruct(String ransomNote, String magazine) {
        boolean answer = true;
        HashMap<Character, Integer> ransomNoteMap = new Solution().getMap(ransomNote);
        HashMap<Character, Integer> magazineMap = new Solution().getMap(magazine);
        for (Map.Entry<Character, Integer> m : ransomNoteMap.entrySet()) {
            if (!(magazineMap.containsKey(m.getKey()) && magazineMap.get(m.getKey()) >= m.getValue())) answer = false;
        }
        return answer;

    }

    public HashMap<Character, Integer> getMap(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : word.toCharArray()) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }
}