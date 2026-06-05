class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        char[] str = s.toCharArray();
        
        int length = str.length;
        int j = length - 1;
        if(length % 2 == 0){
            length = (int)Math.ceil(length/2);
        }else{
            length = length/2;
        }

        for(int i = 0; i < length; i++){
            if(str[i] != str[j]){
                return false;
            }
            j--;
        }
        return true;
    }
}
