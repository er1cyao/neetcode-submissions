class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] conc = new int[(nums.length) * 2];
        for(int i = 0 ; i < nums.length; i++){
            conc[i] = nums[i];
            conc[i+nums.length] = nums[i];
        }
        return conc;
    }
}