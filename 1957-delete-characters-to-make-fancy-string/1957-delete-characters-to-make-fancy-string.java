class Solution {
    public String makeFancyString(String s) {

        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        int count = 1;
        for (int i = 1; i < s.length(); i++) {

            char ch1 = s.charAt(i - 1);
            char ch2 = s.charAt(i);
            if (ch1 == ch2) {
                count++;
            } else
                count = 1;

            if (count < 3)
                str.append(ch2);

        }

        return str.toString();
    }
}