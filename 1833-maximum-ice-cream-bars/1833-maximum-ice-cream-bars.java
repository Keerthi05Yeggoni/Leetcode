class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        //greedy
        // int c=0;
        // Arrays.sort(costs);
        // for(int i=0;i<n;i++){
        //   if(coins<0 || costs[i]>coins){
        //     break;
        //   }
        //   c++;
        //   coins -= costs[i];
        // }
        // return c;
        //counting with optimization
        int[] fre = new int[100001];
        for(int cost : costs){
            fre[cost]++;
        }
        int cnt = 0;
        for(int cost = 1; cost <= 100000; cost++){
            if(fre[cost]==0) continue;
            int canbuy = Math.min(fre[cost], coins/cost);
            cnt += canbuy;
            coins -= canbuy * cost;
            if(coins<cost) break;
        }
        return cnt;
    }
}