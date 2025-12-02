class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        //Arrays.sort(nums);
       int cnt;
       for(int i=0;i<n;i++){
        cnt=0;
        for(int j=0;j<n;j++){
            if(i!=j && nums[j]<nums[i]) cnt++;
        }
        arr[i]=cnt;
       }
       return arr;
    }
}