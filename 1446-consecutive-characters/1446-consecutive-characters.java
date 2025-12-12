class Solution {
    public int maxPower(String s) {
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < s.length(); i++) {
            int prevCh = s.charAt(i - 1);
            int currCh = s.charAt(i);
            if (currCh == prevCh)
                count++;
            else
                count = 1;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}