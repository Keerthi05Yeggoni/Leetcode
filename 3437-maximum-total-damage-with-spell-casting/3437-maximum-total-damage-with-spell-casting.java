class Solution {
    public long maximumTotalDamage(int[] power) {
       Map<Integer, Long> map = new HashMap<>();
        for (int p : power)
            map.put(p, map.getOrDefault(p, 0L) + p);

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        int m = keys.size();

        long[][] dp = new long[m][2]; 

        dp[0][0] = 0;
        dp[0][1] = map.get(keys.get(0));

        for (int i = 1; i < m; i++) {
            int cur = keys.get(i);
            long val = map.get(cur);
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            int j = i - 1;
            while (j >= 0 && keys.get(j) >= cur - 2)
                j--;

            long include = val;
            if (j >= 0) include += Math.max(dp[j][0], dp[j][1]);

            dp[i][1] = include;
        }

        return Math.max(dp[m-1][0], dp[m-1][1]);
    }
    }
