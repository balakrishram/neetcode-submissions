class Solution {
    public String sorter(String s){
        char[] ca = s.toCharArray();
        Arrays.sort(ca);
        return new String(ca);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            String sorted = sorter(s);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}