class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            
            // Temporary variable to hold the previous maxSoFar before updating
            int tempMax = maxSoFar;
            
            maxSoFar = Math.max(curr, Math.max(curr * tempMax, curr * minSoFar));
            minSoFar = Math.min(curr, Math.min(curr * tempMax, curr * minSoFar));
            
            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}