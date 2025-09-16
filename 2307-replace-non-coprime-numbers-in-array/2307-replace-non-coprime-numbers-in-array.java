class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
       
        int n = nums.length;
        int[] arr = new int[n];
        int top = -1;
        for(int num : nums){
            while(top!=-1){
                int x = gcd(arr[top],num);
                if(x==1) break;
                num *= arr[top--]/x;
            }
            arr[++top]=num;
        }
 List<Integer> l = new ArrayList<>(top+1);
 for(int i=0;i<=top;i++){
    l.add(arr[i]);
 }
    return l;
 
 }
 public int gcd(int a, int b){
    return b==0 ? a : gcd(b, a%b);
    }
}