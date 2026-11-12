class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int result=1;

        int start=0;
        int end=1;

        while(end<nums.length){
            if(nums[end]>nums[end-1]){
                result=Math.max(result,end-start+1);
                end++;
            }

            else{
                start=end;
                end++;
            }
        }

        
         start=0;
         end=1;

        while(end<nums.length){
            if(nums[end]<nums[end-1]){
                result=Math.max(result,end-start+1);
                end++;
            }

            else{
                start=end;
                end++;
            }
        }

        return result;
    }
}