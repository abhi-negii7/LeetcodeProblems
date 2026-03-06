class Solution {
    public boolean checkOnesSegment(String s) {
        int totalSeg = 0;
        int countOne = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                if (countOne == 0) {
                    totalSeg++;
                }
                countOne++;
            } else
                countOne = 0;
            if (totalSeg > 1)
                return false;
        }
        return true;
    }
}