class Solution {
    public List<String> removeAnagrams(String[] words) {
      
        List<String> ans = new ArrayList<>();
        String prev = "";
        for(int i=0;i<words.length;i++){
        char[] ch = words[i].toCharArray();
        Arrays.sort(ch);
        String cur = new String(ch);
        if(!cur.equals(prev)){
            ans.add(words[i]);
            prev = cur;
        }
        }
        return ans;
    }
}