class Solution {
    public boolean isAnagram(String s, String t) {
        // sortString(s);
        // sortString(t);
        System.out.println(s);
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(String.valueOf(arr));
        System.out.println(t);
        char [] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        System.out.println(String.valueOf(arr2));
        if(arr.length!=arr2.length){
            return false;
        }
        for (int i=0; i<arr.length;i++){
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}