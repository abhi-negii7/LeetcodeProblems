class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int cntSub = 0;
        int zeroes = 0;
        int ones = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch == '1')
                ones++;
            else
                zeroes++;
            while (zeroes > k && ones > k) {
                char startCh = s.charAt(i);
                if (startCh == '1')
                    ones--;
                else
                    zeroes--;
                i++;
            }
            cntSub += (j - i + 1);
        }
        return cntSub;
    }
}