class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            int firstDigit = details[i].charAt(11) - '0';
            int secondDigit = details[i].charAt(12) - '0';

            if (firstDigit == 6 && secondDigit != 0)
                count++;
            else if (firstDigit > 6)
                count++;
        }
        return count;
    }
}