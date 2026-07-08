class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount+1];
        Arrays.fill(memo,-2);
        return solve(coins,amount,memo);
    }
    private int solve(int[] coins, int rem, int[] memo){
        int n = coins.length;
        if(rem<0) return -1;
        if(rem == 0) return 0;
        if(memo[rem]!=-2) return memo[rem];
        int minc = Integer.MAX_VALUE;
        for(int coin : coins){
            int res = solve(coins, rem-coin,memo);
            if(res >= 0 && res < minc){
                minc = res+1;
            }
        }
        memo[rem]= ((minc==Integer.MAX_VALUE)? -1 : minc);
        return memo[rem];
    }
}