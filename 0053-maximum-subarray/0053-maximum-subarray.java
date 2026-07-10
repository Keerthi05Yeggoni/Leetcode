class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE, cursum = 0;
        for(int i=0;i<n;i++){
            cursum+=nums[i];
            maxi=Math.max(maxi,cursum);
            if(cursum<0) cursum = 0;
        }
        return maxi;
    }
}