class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int low = 0;
        int high = letters.length - 1;

        char ansCh = letters[0];
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                ansCh = letters[mid];
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ansCh;
    }
}