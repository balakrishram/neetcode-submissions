class Solution {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];
        int pre = 1;
        for(int i = 0; i < nums.length; i++){
            output[i] = i > 0 ? pre : 1;
            pre*=nums[i];
        }
        int post = 1;
        for(int i = nums.length -1; i >= 0; i--){
            output[i] = (i== nums.length-1) ? output[i]: output[i]*post;
            post*=nums[i];
        }
        return output;
    }
}