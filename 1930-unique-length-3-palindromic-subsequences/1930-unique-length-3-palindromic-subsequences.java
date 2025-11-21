class Solution {
    public int countPalindromicSubsequence(String s) {
        int count=0;
        for(char c='a'; c<='z'; c++){
            int first=s.indexOf(c);
            int last=s.lastIndexOf(c);
            if(first!=-1 && last!= -1 && first<last -1){
                int[] freq =new int[26];
                for(int mid=first+1; mid<last; mid++){
                    freq[s.charAt(mid)-'a']=1;
                }
                for(int f:freq){
                count+=f;
            }  }
                  }
                  return count;
    }
}