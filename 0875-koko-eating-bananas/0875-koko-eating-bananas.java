class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int low = 1, high = findMax(piles);
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (calculateHours(piles, mid) > h) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private long calculateHours(int[] piles, int k) {
        long hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double)pile/k);
        }
        return hours;
    }

    private int findMax(int[] piles) {
        int max = piles[0];
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}
