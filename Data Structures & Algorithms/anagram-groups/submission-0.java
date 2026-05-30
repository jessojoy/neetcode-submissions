class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
        for(String word: strs){
            int[] key = new int[26];
            char[] ch = word.toCharArray();
            for(int c: ch) {
                key[c - 'a']++;
            }
            String KEY = Arrays.toString(key);
            map.putIfAbsent(KEY,new ArrayList<>());
            map.get(KEY).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
