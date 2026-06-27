class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numsMap = new HashMap<Integer,Integer>();
        int[] outarr = new int[2];
        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (numsMap.containsKey(diff)){
                outarr[0] = numsMap.get(diff);
                outarr[1] = i;        
            }
            numsMap.put(nums[i], i);
        }

        return outarr;
    }
}
