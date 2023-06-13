class Solution {
    public boolean isPalindrome(String s) {
        
       
        String str = s.replace(" ","");
        str= str.replace(",", "");
        str= str.replace(":", "");
        
        str=str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println(str);
        int n = str.length();
        int start=0;
        int end= n-1;
     
        for(int i =0; i<n/2;i++){
            if( str.charAt(i) != str.charAt(n-1-i)){
                return false; 
            }
        }
        
        return true ;   
    }
}