class Solution {

    public String encode(List<String> strs) {
        StringBuilder es = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            es.append(strs.get(i));
            es.append(",");
        }
        return es.toString();
    }

    public List<String> decode(String str) {
        List<String> ds = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ','){
                s.append(str.charAt(i));
            }
            else{
                ds.add(s.toString());
                s = new StringBuilder();
            }
        }
        return ds;
    }
}
