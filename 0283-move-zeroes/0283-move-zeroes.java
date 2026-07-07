class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int[] temp = new int[n];
        for(int num : nums){
            if(num!=0){
               temp[i]=num;
               i++;
            }
            
            
        }
        while(i<nums.length){
        temp[i]=0;
            i++;
        }
        for(int j=0;j<n;j++){
            nums[j]=temp[j];
        }
    }
}