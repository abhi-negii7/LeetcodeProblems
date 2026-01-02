class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int totalCount = 0;
        int i = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() == 3) {
                totalCount = totalCount + (n - j);
                int freq = map.get(s.charAt(i)) - 1;
                if (freq == 0)
                    map.remove(s.charAt(i));
                else
                    map.put(s.charAt(i), freq);
                i++;
            }
        }
        return totalCount;
    }
}