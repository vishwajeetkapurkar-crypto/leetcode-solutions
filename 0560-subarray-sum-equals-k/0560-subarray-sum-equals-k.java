class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currSum = 0;
        
        // Map to store the frequency of prefix sums
        // Key: prefix sum, Value: frequency of this prefix sum
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
        // Base case: a prefix sum of 0 occurs 1 time (handles subarrays starting from index 0)
        prefixSumMap.put(0, 1);
        
        for (int num : nums) {
            currSum += num;
            
            // Check if there is a previous prefix sum that equals (currSum - k)
            int target = currSum - k;
            if (prefixSumMap.containsKey(target)) {
                count += prefixSumMap.get(target);
            }
            
            // Add the current prefix sum to the map
            prefixSumMap.put(currSum, prefixSumMap.getOrDefault(currSum, 0) + 1);
        }
        
        return count;
    }
}