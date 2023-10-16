class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        return combination(digits, "");
    }

    static ArrayList<String> combination(String digits, String p) {
        if (digits.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char digit = digits.charAt(0);
        String letters = getLettersForDigit(digit);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            list.addAll(combination(digits.substring(1), p + ch));
        }
        return list;
    }

    static String getLettersForDigit(char digit) {
        String[] digitToLetters = {
            "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        int index = digit - '2';
        return digitToLetters[index];
    }
}