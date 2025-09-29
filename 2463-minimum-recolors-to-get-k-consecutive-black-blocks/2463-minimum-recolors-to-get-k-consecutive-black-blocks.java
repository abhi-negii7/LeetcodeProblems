class Solution {
    public int minimumRecolors(String blocks, int k) {

        int minOp = Integer.MAX_VALUE;
        int countOp = 0;

        // Two pointers
        int i = 0;
        int j = 0;

        while (j < blocks.length()) {

            char ch = blocks.charAt(j);

            if (ch == 'W')
                countOp++;

            if (j - i + 1 == k) {
                minOp = Math.min(minOp, countOp);

                if (blocks.charAt(i) == 'W')
                    countOp--;
                i++;
            }
            j++;
        }
        return minOp;
    }
}