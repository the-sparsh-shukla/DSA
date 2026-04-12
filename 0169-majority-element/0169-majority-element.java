class Solution {
    public int majorityElement(int[] nums) {
        int c=0,res=0;
     for(int n:nums){
        if(c==0){
            res=n;
        }
        c+=(n==res)?1:-1;
     }   
        return res; 
    }
}