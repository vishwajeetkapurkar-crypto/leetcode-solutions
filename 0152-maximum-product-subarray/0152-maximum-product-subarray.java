class Solution {
    public int maxProduct(int[] nums) {
        int maxmul=nums[0];

        for(int i=0 ; i<nums.length ; i++){
        int mul=1;

        for(int j=i ; j<nums.length ;j++){
            mul=mul*nums[j];
            if(mul>maxmul){
                maxmul=mul;
            }
        }
        }
        return maxmul;
    }
}