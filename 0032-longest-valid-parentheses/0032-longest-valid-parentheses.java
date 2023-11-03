class Solution {
    public int longestValidParentheses(String s) {
        int N = s.length();
        boolean[] valid = new boolean[N];
        for(int i = 1, j; i < N; i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i - 1) == '(')
                    valid[i - 1] = valid[i] = true;
                else if(valid[i - 1]){
                    j = i - 3;
                    while(j > -1 && valid[j]) j -= 2;
                    if(j != -1 && s.charAt(j) == '(')
                        valid[j] = valid[i] = true;
                }
            }
        }
        int max = 0, temp = 0;
        for(boolean v : valid){
            temp += v? 1 : -temp;
            if(max < temp) max = temp;
        }
        return max;
    }
}