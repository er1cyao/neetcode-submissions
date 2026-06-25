class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> snum = new HashMap<Character, Integer>();
        HashMap<Character,Integer> tnum = new HashMap<Character, Integer>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i <s.length(); i++){
            snum.merge(s.charAt(i), 1, (oldValue, newValue) -> oldValue + 1);
            tnum.merge(t.charAt(i), 1, (oldValue, newValue) -> oldValue + 1);


        }
        return snum.equals(tnum);
    }
}
