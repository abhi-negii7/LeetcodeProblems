class Solution {
    public int maxVowels(String s, int k) {

        int maxCount = 0;
        int countVowel = 0;

        // Two pointer
        int i = 0;
        int j = 0;

        while (j < s.length()) {

            char ch = s.charAt(j);
            int windSize = j - i + 1;
            // if character is vowel
            if (isVowel(ch))
                countVowel++;

            // window Size is equal to k
            if (windSize == k) {
                maxCount = Math.max(maxCount, countVowel);

                if (isVowel(s.charAt(i)))
                    countVowel--;
                i++;
            }
            j++;
        }
        return maxCount;
    }

    public boolean isVowel(char ch) {
        // Character is vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }
}