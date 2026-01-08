class Solution {
    public int minDeletionSize(String[] strs) {

        char ch[][] = new char[strs.length][strs[0].length()];

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                ch[i][j] = strs[i].charAt(j);
            }
        }
        int count = 0;
        for (int i = 0; i < ch[0].length; i++) {
            for (int j = 1; j < ch.length; j++) {
                if (ch[j][i] - 'a' < ch[j - 1][i] - 'a') {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}