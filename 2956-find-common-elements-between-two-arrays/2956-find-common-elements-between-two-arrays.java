class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int [] array = new int[2];

        for(int i=nums1.length-1 ; i>=0 ; i--){
            for(int j=nums2.length-1 ; j>=0; j--){
                if(nums1[i]==nums2[j]){
                    array[0]++;
                    break;
                }
            }
        }

        for(int i=nums2.length-1 ; i>=0 ; i--){
            for(int j=0 ; j<nums1.length ; j++){
                if(nums2[i]==nums1[j]){
                    array[1]++;
                    break;
                }
            }
        }

        return array;
    }
}