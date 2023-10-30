class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        boolean flag = true;
        int i = 0;

        // Trim leading white spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Check for the sign
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            flag = s.charAt(i) == '+';
            i++;
        }

        // Iterate through the remaining characters
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i) - '0');

            // Check for overflow
            if (flag && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (!flag && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        // Apply sign and check for overflow
        if (!flag) {
            ans = -ans;
        }

        // Check for overflow again
        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) ans;
    }
}
