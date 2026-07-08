class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int cnte =0;
        int cnto = 0;
        for(int num : nums){
            if(num % 2 == 0){
                cnte++;
            }else{
                cnto++;
            }
        }
        int evendp =0;
        int odddp = 0;
        for(int num : nums){
            if(num % 2==0){
                evendp = Math.max(evendp,odddp+1);
            }else{
                odddp = Math.max(odddp,evendp+1);
            }
        }
        return Math.max(Math.max(cnte,cnto),Math.max(evendp,odddp));
    }
}