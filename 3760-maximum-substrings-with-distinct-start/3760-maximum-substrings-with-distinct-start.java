class Solution {
    public int maxDistinct(String s) {
        boolean alphaArr[] = new boolean[26];
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (!alphaArr[ch - 'a']) {
                alphaArr[ch - 'a'] = true;
                count++;
            }
        }
        return count;
    }
}