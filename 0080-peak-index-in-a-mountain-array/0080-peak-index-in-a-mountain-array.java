class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int count = 0;
       for(int i=0;i<arr.length-1;i++){
        if(arr[i]<arr[i+1]){
            count = i+1;
        }
       }
       return count;
    }
}