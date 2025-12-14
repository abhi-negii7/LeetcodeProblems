class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int diff = ch - 'a';
            int prod = (i + 1) * (26 - diff);
            sum = sum + prod;
        }
        return sum;
    }
}