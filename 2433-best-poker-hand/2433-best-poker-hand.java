class Solution {
    public String bestHand(int[] ranks, char[] suits) {

        int rankArr[] = new int[14];
        int suitArr[] = new int[4];
        int pokerSuit = 0;
        int pokerRank = 0;

        for (int i = 0; i < ranks.length; i++) {
            char ch = suits[i];
            pokerSuit = Math.max(pokerSuit, ++(suitArr[ch - 'a']));
            pokerRank = Math.max(pokerRank, ++(rankArr[ranks[i]]));
        }
    System.out.println(pokerSuit);
        if (pokerSuit == 5)
            return "Flush";
        else if (pokerRank >= 3)
            return "Three of a Kind";
        else if (pokerRank == 2)
            return "Pair";
        return "High Card";
    }
}