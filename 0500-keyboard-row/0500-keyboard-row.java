class Solution {
   public String[] findWords(String[] words) {
        
        HashMap<Character,Integer> k=new HashMap<>();
         String str1="qwertyuiopQWERTYUIOP";
         String str2="ASDFGHJKLasdfghjkl";
         String str3="zwxcvbnmZXCVBNM";
         int prev=0,curr=0;boolean b=true;
         List<String> res=new ArrayList<>();

         for(int i=0;i<words.length;i++){
             b=true;
             for(int j=0;j<words[i].length();j++){
                 
                   if(str1.indexOf(""+words[i].charAt(j))>=0){
                       k.put(words[i].charAt(j),1);
                       curr=1;
                   }else if(str2.indexOf(""+words[i].charAt(j))>=0){
                       k.put(words[i].charAt(j),2);
                       curr=2;
                   }else{
                       k.put(words[i].charAt(j),3);
                       curr=3;
                   }
             } prev=k.get(words[i].charAt(0));
             for(int z=1;z<words[i].length();z++){
                 if(k.get(words[i].charAt(z))!=prev){
                     b=false;
                     break;
                 }
             }if(b){
                 res.add(words[i]);
             }k.clear();
         
    }return res.toArray(new String[0]);
}
}