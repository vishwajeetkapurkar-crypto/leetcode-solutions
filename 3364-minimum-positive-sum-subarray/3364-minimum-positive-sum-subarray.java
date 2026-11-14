class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        for (int size = l; size <= r; size++) {
            for (int i = 0; i <= n - size; i++) {
                int currentSum = 0;
                
                for (int j = i; j < i + size; j++) {
                    currentSum += nums.get(j);
                }

                if (currentSum > 0) {
                    minSum = Math.min(minSum, currentSum);
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}