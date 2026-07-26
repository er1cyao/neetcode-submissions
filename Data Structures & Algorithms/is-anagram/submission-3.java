class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        if (s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            sMap.merge(s.charAt(i), 1, Integer::sum);
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }
        if(sMap.equals(tMap)){
            return true;
        }else{
            return false;
        }
    }
}
