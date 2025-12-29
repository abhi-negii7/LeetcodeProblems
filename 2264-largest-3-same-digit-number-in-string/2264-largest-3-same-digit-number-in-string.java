class Solution {
    public String largestGoodInteger(String num) {

        int prev = -1;
        int endIdx = -1;
        int count = 0;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < num.length(); i++) {
            int currVal = num.charAt(i) - '0';

            if (currVal == prev) {
                count++;
                if (count == 3 && currVal > maxVal) {
                    endIdx = i;
                    maxVal = currVal;
                }
            }
            else{
                count=1;
                prev = currVal;
            }
        }
        if (endIdx == -1)
            return "";
        return num.substring(endIdx - 2, endIdx + 1);
    }
}