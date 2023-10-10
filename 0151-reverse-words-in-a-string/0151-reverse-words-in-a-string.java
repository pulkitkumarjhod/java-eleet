class Solution {
    public String reverseWords(String s) {
        
        List<String> list = new ArrayList<>();
    String words[] = s.split(" ");
        for (String word: words){
            if(!"".equals(word))
            list.add(word);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(list.size()-1-i)).append(" ");
        }
        return sb.toString().trim();
        
        
    }   
}       