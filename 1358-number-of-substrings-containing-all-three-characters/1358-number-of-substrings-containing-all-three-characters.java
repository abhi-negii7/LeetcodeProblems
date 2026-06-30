class Solution {
    public int numberOfSubstrings(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int j = 0;
        int i = 0;

        while (i < s.length()) {

            char currCh = s.charAt(i);

            map.put(currCh, map.getOrDefault(currCh, 0) + 1);

            while (map.size() == 3) {
                count = count + (s.length() - i);
                char prevCh = s.charAt(j);
                map.put(prevCh, map.get(prevCh) - 1);
                if (map.get(prevCh) == 0) {
                    map.remove(prevCh);
                }
                j++;
            }
            i++;
        }
        return count;
    }
}