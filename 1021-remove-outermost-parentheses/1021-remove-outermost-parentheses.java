class Solution {
    public String removeOuterParentheses(String s) {

        int openBrac = 0;
        int endBrac = 0;

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                openBrac++;
                endBrac--;
            } else if (ch == ')') {
                endBrac++;
                openBrac--;
            }
            if (ch == '(' && openBrac > 1) {
                str.append(ch);
            } else if (ch == ')' && openBrac > endBrac)
                str.append(ch);
        }
        return str.toString();
    }
}