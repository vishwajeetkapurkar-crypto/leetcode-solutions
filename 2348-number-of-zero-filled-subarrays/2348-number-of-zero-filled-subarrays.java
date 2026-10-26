class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long totalcount = 0;
        long currentcount=0;

        for (int i = 0; i < nums.length; i++) {
          if(nums[i]==0){
            currentcount++;
            totalcount+=currentcount;
          }

          else{
            currentcount=0;
          }
        }

        return totalcount;
    }
}