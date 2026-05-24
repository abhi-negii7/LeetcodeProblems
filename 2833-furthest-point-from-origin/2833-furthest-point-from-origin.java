class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        int countDash = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L')
                countL++;
            else if (ch == 'R')
                countR++;
            else
                countDash++;
        }
        if (countL == 0 && countR == 0)
            return countDash;
        else if (countL > countR)
            return (countL + countDash) - countR;
        else
            return (countR + countDash) - countL;

    }
}