class Solution {
    public long countOfSubstrings(String word, int k) {

        int n = word.length();
        long result = 0;
        // To store the count of consonents
        int cntCons = 0;

        // Nearest consonent to the right
        int nearCons[] = new int[n];
        int cons = n;

        for (int i = n - 1; i >= 0; i--) {
            nearCons[i] = cons;
            if (!isVowel(word.charAt(i)))
                cons = i;
        }

        // To store the vowels
        HashMap<Character, Integer> map = new HashMap<>();
        // Two pointers
        int i = 0;
        int j = 0;

        while (j < word.length()) {

            char ch = word.charAt(j);

            if (isVowel(ch))
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            else
                cntCons++;

            while (cntCons > k) {
                char startCh = word.charAt(i);
                // if ith index is vowel
                if (isVowel(startCh)) {
                    map.put(startCh, map.get(startCh) - 1);
                    if (map.get(startCh) == 0)
                        map.remove(startCh);
                } else
                    cntCons--;
                i++;
            }

            while(map.size() == 5 && cntCons == k) {
                result = result + (nearCons[j] - j);
                 char startCh = word.charAt(i);
                // if ith index is vowel
                if (isVowel(startCh)) {
                    map.put(startCh, map.get(startCh) - 1);
                    if (map.get(startCh) == 0)
                        map.remove(startCh);
                } else
                    cntCons--;
                i++;
            }

            j++;
        }

        return result;
    }

    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }
}