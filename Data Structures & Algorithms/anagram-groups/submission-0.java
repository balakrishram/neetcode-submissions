class Solution {
    public String sorter(String s){
        char[] ca = s.toCharArray();
        Arrays.sort(ca);
        return new String(ca);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> sorted = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            sorted.add(sorter(strs[i]));
        }
        System.out.println(sorted);
        
        List<List<String>> list = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            List<String> s = new ArrayList<>();
            if(!sorted.get(i).equals("-1")){
                s.add(strs[i]);
            }
            for(int j = i+1; j < strs.length; j++){
                if(sorted.get(i).equals(sorted.get(j)) && !sorted.get(j).equals("-1")){
                    s.add(strs[j]);
                    sorted.set(j,"-1");
                }
            }
            sorted.set(i,"-1");
            if(s.size() > 0)
                list.add(s);
        }
        return list;
    }
}
