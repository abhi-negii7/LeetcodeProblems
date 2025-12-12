class Solution {
    public int minimumChairs(String s) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'E')
                count++;
            else
                count--;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}