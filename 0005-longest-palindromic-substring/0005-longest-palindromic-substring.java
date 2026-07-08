class Solution {
    public String longestPalindrome(String s) {
       int n  = s.length();
       if(n==0) return "";
       boolean[][] dp = new boolean[n][n];
       int st = 0;
       int maxl = 1;
       for(int i=0;i<n;i++){
        dp[i][i]=true;
       }
       for(int len = 2;len<=n;len++){
        for(int i=0;i<=n-len;i++){
            int j = i+len-1;
            if(s.charAt(i)==s.charAt(j)){
                if(len==2 || len==3){
                    dp[i][j]=true;
                }else{
                    dp[i][j]=dp[i+1][j-1];
                }
                if(dp[i][j] && len > maxl){
                    st = i;
                    maxl = len;
                }
            }
        }
       }
       return s.substring(st,st+maxl);
        
    }
}