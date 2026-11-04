class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        int result=0;
        for(int i=0 ; i<nums.length ; i++){
            if(mid>nums[i]){
                result+=(mid-nums[i]);
            }
            else{
                result+=(nums[i]-mid);
            }
        }

        return result;
    }
}