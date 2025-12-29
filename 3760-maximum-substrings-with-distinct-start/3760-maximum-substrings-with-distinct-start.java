class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                count++;
            }
        }
        return count;
    }
}