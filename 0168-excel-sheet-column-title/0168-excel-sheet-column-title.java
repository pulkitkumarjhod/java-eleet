class Solution {
     public String convertToTitle(int columnNumber) {
        String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",};
        String result = "";
        if(columnNumber<=26) return alpha[columnNumber-1];
        else{
            while(columnNumber>0){
                int digit = (columnNumber-1)%26;
                result = result + alpha[digit];
                columnNumber = (columnNumber-1)/26;
            }
            int left = 0;
            int right = result.length()-1;
            char[] str = result.toCharArray();
            while(left<right){
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
            return new String(str);
        }
    }
}