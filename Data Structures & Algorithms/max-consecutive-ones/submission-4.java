class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur = 0, max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                max = (cur>max) ? max = cur : max;
                cur = 0;   
            }
            else if(nums[i] == 1){
                cur++;
            }

        }
        max = (cur>max) ? max = cur : max;
        return max;
    }
}