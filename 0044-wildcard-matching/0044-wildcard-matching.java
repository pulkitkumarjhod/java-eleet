class Solution {
 public boolean isMatch(String s, String p) {
        int i=0,j=0,ss=-1,l=-1;
        while(i<s.length()){
            if(j<p.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')){
                i++;
                j++;
            }else if(j<p.length() && p.charAt(j)=='*'){
                ss=j;
                l=i;
                j++;
            }else if(ss!=-1){
                j=ss+1;
                l++;
                i=l;    
            }else
                return false;
        }  
        while(j<p.length() && p.charAt(j)=='*') j++;
        if(i!=s.length() || j!=p.length()) return false; 
        return true;
     
    }
}