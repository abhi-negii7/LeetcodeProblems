class Solution {
    public String sortSentence(String s) {

        String[] str = s.split(" ");
        StringBuilder ansStr = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            int idx = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[j].charAt(str[j].length() - 1) - '0' == i + 1) {
                    idx = j;
                    break;
                }
            }
            ansStr.append(str[idx].substring(0, str[idx].length() - 1));
            ansStr.append(" ");
        }
        return ansStr.toString().trim();
    }
}