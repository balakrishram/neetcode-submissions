class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        int max = 1;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        for(int n :set){
            if(!set.contains(n-1)){
                int temp = 1;
                for(int x = n+1;set.contains(x); x++){
                    temp++;
                }
                max = Math.max(max,temp);
            }
        }
        return max;
    }
}
