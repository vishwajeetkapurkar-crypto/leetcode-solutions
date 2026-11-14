class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        for (int size = l; size <= r; size++) {
            int start=0 ;
            int end=size-1;
            int currentsum=0;

            for(int i=0 ; i<size ; i++){
                currentsum+=nums.get(i);
            }
            if(currentsum>0){
                    minSum=Math.min(minSum,currentsum);
                }

            while(end<n-1){
                
                currentsum-=nums.get(start);
                start++;
                end++;
                currentsum+=nums.get(end);

                if(currentsum>0){
                    minSum=Math.min(minSum,currentsum);
                }
            }

            }
             return minSum == Integer.MAX_VALUE ? -1 : minSum;
        }

       
    }
