class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder str = new StringBuilder();

        int lev = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                lev++;
                if (lev > 1) {
                    str.append(ch);
                }
            } else if (ch == ')') {
                lev--;
                if (lev >= 1) {
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}