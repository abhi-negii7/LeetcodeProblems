class Solution {
    public boolean closeStrings(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();

        if (len1 != len2)
            return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < len1; i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            freq1[ch1 - 'a']++;
            freq2[ch2 - 'a']++;
        }

        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] == 0 && freq2[i] == 0)
                continue;
            if (freq1[i] != 0 && freq2[i] != 0)
                continue;
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : freq1) {
            if (i >= 1)
                map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : freq2) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0)
                    map.remove(i);
            }
        }

        if (!map.isEmpty())
            return false;
        return true;
    }
}