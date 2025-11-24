class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n = nums.length;
        List<Boolean> al = new ArrayList<>(n);
        int val = 0;
        for(int num : nums){
            val = (val*2 + num) % 5;
            al.add(val==0);
        }
        return al;
    }
}