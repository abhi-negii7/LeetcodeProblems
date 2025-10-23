class Solution {
    public boolean hasSameDigits(String s) {

        while (s.length() > 2) {

            StringBuilder str = new StringBuilder();

            for (int i = 1; i < s.length(); i++) {
                int val1 = s.charAt(i) - '0';
                int val2 = s.charAt(i - 1) - '0';
                int sum = (val1 + val2) % 10;
                str.append(sum);
            }
            s = str.toString();
        }

        return s.charAt(0) == s.charAt(1);
    }
}