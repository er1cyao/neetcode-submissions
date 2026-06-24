class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int cur = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            cur = arr[i];
            arr[i] = max;
            max = (cur > max) ? cur : max;
            
            
        }

        return arr;
    }
}