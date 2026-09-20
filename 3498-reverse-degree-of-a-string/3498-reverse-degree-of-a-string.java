class Solution {
    public int reverseDegree(String s) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            int chVal = s.charAt(i) - 'a';
            sum = sum + ((26 - chVal) * (i + 1));
        }

        return sum;
    }
}