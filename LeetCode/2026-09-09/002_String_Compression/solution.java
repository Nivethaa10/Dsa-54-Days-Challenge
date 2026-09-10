class Solution {
    public int compress(char[] chars) {
        int ans = 0;
        for (int i = 0; i < chars.length;) {
            final char letter = chars[i];
            int count = 0;

        
