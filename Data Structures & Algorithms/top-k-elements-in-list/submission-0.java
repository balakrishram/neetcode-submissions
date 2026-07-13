class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 0 && k >=0; i--){
            if( i == nums.length - 1){
                res[--k] = nums[i];
            } else if ( nums[i+1] != nums[i]) {
                res[--k] = nums[i];
            }
        }
        
        return res;
    }
}
