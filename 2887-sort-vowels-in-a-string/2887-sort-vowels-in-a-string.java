class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Integer> position = new ArrayList<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                 vowel.add(ch);
                 position.add(i);
        }}
        Collections.sort(vowel);
        char[] answer = s.toCharArray();
        for(int i=0;i<position.size();i++){
            answer[position.get(i)]=vowel.get(i);
        }
        return new String(answer);
    }
}