class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        int maxvowel = 0, maxconst = 0;
        int[] freq = new int[26]; // to count the frequency of each character
        for(char c : s.toCharArray()){
            int i = c-'a'; // to get the char mapped to its index directly;
            freq[i]++; 
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
              maxvowel = Math.max(maxvowel,freq[i]);
            }else{
                maxconst = Math.max(maxconst,freq[i]);
            }
        }
        return maxvowel + maxconst;
    }
}