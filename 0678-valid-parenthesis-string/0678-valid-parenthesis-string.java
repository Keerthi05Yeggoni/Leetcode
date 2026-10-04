class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int low = 0;
        int high = 0;
        for(int i=0;i<n;i++){
            low += s.charAt(i) == '(' ? 1 : -1;
            high += s.charAt(i) == ')' ? -1 : 1;
            if(high < 0) return false;
            low = Math.max(low,0);
        }
        return low == 0;
    }
}