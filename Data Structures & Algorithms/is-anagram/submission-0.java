class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            smap.put(a,smap.getOrDefault(a, 0) + 1);
            char b = t.charAt(i);
            tmap.put(b,tmap.getOrDefault(b, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(!smap.get(x).equals(tmap.get(x))){
                return false;
            }
        }

        return true;
    }
}