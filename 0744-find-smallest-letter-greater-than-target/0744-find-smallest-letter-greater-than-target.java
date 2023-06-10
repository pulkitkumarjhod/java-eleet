class Solution 
{
    public char nextGreatestLetter(char[] letters, char target) 
    {
        int asciival= target;
        System.out.println(asciival);
        for(int i =0;i<letters.length;i++){
            int x =letters[i];
            if(asciival<x){
                return letters[i];
            }
           
        }
        return letters[0];
        
    }
}