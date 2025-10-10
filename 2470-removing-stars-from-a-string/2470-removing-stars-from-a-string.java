class Solution {
    public String removeStars(String s) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch == '*') {
                str.deleteCharAt(str.length() - 1);
            } else
                str.append(ch);
        }
        return str.toString();
    }
}