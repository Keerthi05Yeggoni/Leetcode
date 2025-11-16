class Solution {
    public int numSub(String s) {
        int n = s.length();
        int cnt = 0;
        int res = 0, mod = (int)1e9 + 7;
        for(int i=0;i<n;i++){
            cnt = s.charAt(i)=='1' ? cnt+1 : 0;
            res = (res+cnt) % mod;

        }
        return res;
    }
}