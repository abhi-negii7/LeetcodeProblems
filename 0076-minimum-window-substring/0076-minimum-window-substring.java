class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int cntEle = 0;
        int startIdx = 0;
        int endIdx = -1;
        int minLen = Integer.MAX_VALUE;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0)
                    cntEle++;
            }

            while (i <= j && cntEle == map.size()) {
                char startCh = s.charAt(i);
                if (minLen > j - i + 1) {
                    startIdx = i;
                    endIdx = j;
                    minLen = j - i + 1;
                }
                if (map.containsKey(startCh)) {
                    map.put(startCh, map.get(startCh) + 1);
                    if (map.get(startCh) == 1)
                        cntEle--;
                }
                i++;
            }
        }
        return s.substring(startIdx, endIdx + 1);
    }
}