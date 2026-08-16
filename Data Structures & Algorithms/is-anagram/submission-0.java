class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> mp = new HashMap<>();
        for(int i = 0;i<s.length();i++){
          char c= s.charAt(i);
          mp.put(c, mp.getOrDefault(c,0)+1);
        }
        for(int i = 0;i<t.length();i++){
            char c = t.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)-1);
        }
        for(int value: mp.values()){
            if(value!=0) return false;
        }
        return true;

    }
}
