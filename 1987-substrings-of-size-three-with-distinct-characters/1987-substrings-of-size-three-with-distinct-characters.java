class Solution {
    public int countGoodSubstrings(String s) {
        
        if(s.length()<3) return 0;
        HashMap<Character, Integer> map = new HashMap<>();

        // Two pointers
        int i = 0;
        int j = 0;
        int maxCount = 0;

        while (j < s.length()) {

            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (j - i + 1 == 3) {

                if (map.size() == 3) {
                    maxCount++;
                }
                char chI = s.charAt(i);
                map.put(chI, map.get(chI) - 1);
                if (map.get(chI) == 0)
                    map.remove(chI);
                i++;
            }
            j++;
        }
        return maxCount;
    }
}