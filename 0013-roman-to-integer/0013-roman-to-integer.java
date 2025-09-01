class Solution {
    public int romanToInt(String s) {
     Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        int n = s.length();
        // Iterate through the Roman numeral string
        for (int i = 0; i < n; i++) {
            int currentVal = romanMap.get(s.charAt(i));
            // Check if the current value is less than the next value
            if (i < n - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                result -= currentVal; // Subtract the current value
            } else {
                result += currentVal; // Add the current value
            }
        }
        return result;
    }}