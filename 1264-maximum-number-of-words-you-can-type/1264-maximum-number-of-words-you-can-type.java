class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int n = text.length();
        boolean[] invalid = new boolean[26];
        for(char c : brokenLetters.toCharArray()){
            invalid[c-'a']=true;
        }
        int cnt = 0; // to count the valid words;
        boolean valid = true;
        for(int i=0;i<=n;i++){
            if(i<n && text.charAt(i)!=' '){
            if(invalid[text.charAt(i)-'a']){
                valid = false;
            }
        }else{
            if(valid) cnt++;
            valid = true;
        }
        }
        return cnt;
    }
}