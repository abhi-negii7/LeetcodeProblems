class Solution {
    public String rearrangeString(String s, char x, char y) {

        int countX = 0;
        int countY = 0;
        for (char ch : s.toCharArray()) {
            if (ch == x)
                countX++;
            else if (ch == y)
                countY++;
        }

        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch != x && ch != y)
                str.append(ch);
        }
        for (int i = 0; i < countY; i++) {
            str.append(y);
        }
        for (int i = 0; i < countX; i++) {
            str.append(x);
        }
        return str.toString();

    }
}