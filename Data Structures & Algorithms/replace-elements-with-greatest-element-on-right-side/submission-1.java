class Solution {
    public int[] replaceElements(int[] arr) {
        int i = 1, j = 0, max = -1;
        while(j<arr.length - 1){
            
            if(arr[i] > max){
                arr[j] = arr[i];
                max = arr[i];
            }
            i++;
            if (i == arr.length){
                max = -1;
                j++;
                i = j+1;
            }
            
        }
        arr[j] = -1;
        return arr;
    }
}