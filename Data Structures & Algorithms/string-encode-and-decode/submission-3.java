class Solution {

    public String encode(List<String> strs) {
        StringBuilder es1 = new StringBuilder();
        StringBuilder es2 = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            es1.append(strs.get(i).length());
            es1.append(',');
            es2.append('#');
            es2.append(strs.get(i));
        }
        es1.append(es2);
        System.out.println(es1.toString());
        return es1.toString();
    }

    public List<String> decode(String str) {
        List<String> ds = new ArrayList<>();
        List<Integer> lengths = new ArrayList<>();
        int xx = 0;
        while(str.length() > 0 && str.charAt(xx) != '#'){
            StringBuilder x = new StringBuilder();
            while(str.charAt(xx) != ','){
                x.append(str.charAt(xx));
                xx++;
            }
            lengths.add(Integer.parseInt(x.toString()));
            xx++;
        }
        int starts = ++xx;
        System.out.println(lengths.toString());
        for(int i = 0; i < lengths.size(); i++){
            ds.add(str.substring(starts,starts+lengths.get(i)));
            starts=starts+lengths.get(i)+1;
        }
        return ds;
    }
}
