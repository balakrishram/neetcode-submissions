class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) return 0;
        int max = 1;
        for(int i = 0; i < nums.length-1; ){
            int temp = 1;
            for(int j = i+1; j < nums.length; ){
                if(nums[j] == nums[i]){
                    i++;
                    j++;
                }
                else if(nums[j] == nums[i]+1){
                    temp++;
                    j++;
                    i++;
                    max = Math.max(temp,max);
                }
                else{
                    i=j;
                    max = Math.max(temp,max);
                    break;
                }
            }
        }
        return max;
    }
}