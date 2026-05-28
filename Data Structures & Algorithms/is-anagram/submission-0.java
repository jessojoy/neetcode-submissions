class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null){
            return false;
        }

        //after some null checks we have to fix some edge cases where there could be whitespaces involved.
        s = s.toLowerCase().replaceAll("\\s","");
        t = t.toLowerCase().replaceAll("\\s","");

        if(s.length() != t.length()){
            return false;
        }

        char[] freq = new char[256];

        // This is our main code logic where we add to frequency of char from one string
        // and reduce from char of other thus if anagram resulting in full zeroes.
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
            freq[t.charAt(i)]--;
        }

        for(int count : freq){
            if(count != 0){
                return false;
            }
        }

        return true;
    
        
    }
}
