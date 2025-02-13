class Solution {
    public int romanToInt(String s) {
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        char[] symbols = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        
        int num = 0;
        int prevValue = getValue(s.charAt(0), values, symbols);
        
        for (int i = 1; i < s.length(); i++) {
            int currValue = getValue(s.charAt(i), values, symbols);
            if (currValue > prevValue) {
                num -= prevValue;
            } else {
                num += prevValue;
            }
            prevValue = currValue;
        }
        
        num += prevValue;
        return num;
    }
    
    private int getValue(char ch, int[] values, char[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == ch) {
                return values[i];
            }
        }
        return 0;  
    }
}
