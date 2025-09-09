class Solution {
    int mod = (int)(1e9+7);
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n+1];
        dp[1]=1;
        long nop = 0;// count of people who can share the secrets
        for(int i=2;i<=n;i++){
            long newp = 0;
            if(i-delay>=1)
                newp = dp[i-delay];
                long forgp = 0;
                if(i-forget>=1)
                    forgp = dp[i-forget];
                nop = (nop+newp-forgp + mod) % mod;
                dp[i]=nop;
            
        }
        long ans = 0;
        for(int i=n-forget+1;i<=n;i++){
            if(i>=1) ans = (ans+dp[i])%mod;

        }
        return (int)ans;
    }
}