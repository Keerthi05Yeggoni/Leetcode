class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        if(n==1) return 0;
        int mini = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(nums[i]==target){
                mini = Math.min(mini,Math.abs(start-i));
          //int diff = Math.abs(i-start)
        }
        
        }
        return mini;
    }
}