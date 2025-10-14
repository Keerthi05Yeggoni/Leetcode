class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int inc = 1, prev = 0, maxlen = 0;
        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)) inc++;
            else{
                prev = inc;
                inc = 1;
            }
            maxlen = Math.max(maxlen, Math.max(inc >> 1, Math.min(prev,inc)));
            if(maxlen>=k) return true;
        }
        return false;
    }
}