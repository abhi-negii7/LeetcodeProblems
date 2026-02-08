class Solution {
    public boolean isBalanced(String nums) {

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < nums.length(); i++) {
            char ch = nums.charAt(i);
            if ((i & 1) == 0)
                oddSum += ch-'0';
            else
                evenSum += ch-'0';

        }
        return oddSum == evenSum;
    }
}