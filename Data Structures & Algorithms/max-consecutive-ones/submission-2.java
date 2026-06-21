class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxconsec = 0;
        int consec = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] ==1){
                consec++;
            }
            else{
                if (consec>maxconsec){
                    maxconsec = consec;
                    consec = 0;
                }
                consec = 0;
            }
        }
        if(consec>maxconsec){
            return consec;
        }
        return maxconsec;
    }
}