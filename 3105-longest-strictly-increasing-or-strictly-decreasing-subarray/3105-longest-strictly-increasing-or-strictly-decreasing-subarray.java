class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int result=1;
        int incount=1;
        int decount=1;

        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]>nums[i-1]){
                incount++;
                decount=1;
            }

            else if (nums[i]<nums[i-1]){
                decount++;
                incount=1;
            }
             
             else{
                decount=1;
                incount=1;
             }

             result=Math.max(result,Math.max(decount,incount));
        }

        return result;
    }
}