class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        Set<Integer> usertoteach = new HashSet<>();
        for(int[] fs : friendships){
            int u1 = fs[0]-1;
            int u2 = fs[1]-1;
            boolean cancomm = false;
            for(int l1 : languages[u1]){
                for(int l2: languages[u2]){
                    if(l1==l2){
                        cancomm = true;
                        break;
                    }
                }
                if(cancomm) break;
            }
            if(!cancomm){
                usertoteach.add(u1);
                usertoteach.add(u2);

            }

        }
        int minusers = m+1;
        for(int lang = 1; lang<=n; lang++){
            int cnt = 0;
            for(int user : usertoteach){
                boolean knowlang = false;
                for(int l : languages[user]){
                    if(l==lang){
                        knowlang = true;
                        break;
                    }
                }
                if(!knowlang) cnt++;
            }
            minusers = Math.min(minusers,cnt);
        }
        return minusers;
    }
}