class Solution {
    public int longestContinuousSubstring(String s) {

        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {

            char currCh = s.charAt(i);
            char prevCh = s.charAt(i - 1);
            if ((currCh - 1) == (prevCh - 0)) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 1;
            }
        }
        return maxCount;
    }
}