class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){return false;}
        // String[] x = s.toCharArray();
        // String[] y = goal.toCharArray();
        // Arrays.sort(x);
        // Arrays.sort(y);
        // if(x==y){return true;}
        
        s = s + s;

        // Check if goal is a substring of s
        return s.contains(goal);
        
        
        //return false;
    }
}