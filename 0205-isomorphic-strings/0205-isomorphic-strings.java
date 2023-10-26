class Solution {
        public boolean isIsomorphic(String s, String t) {
        return numberCode(s).equals(numberCode(t));
    }

    public String numberCode(String s) {
        Map<Character, Integer> m = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int idx = 1;

        for(char c : s.toCharArray()) {
            m.putIfAbsent(c, idx++);
            sb.append(m.get(c)).append("-");
        }

        return sb.toString();
    }
}