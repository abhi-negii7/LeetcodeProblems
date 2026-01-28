class Solution {
    public int countKeyChanges(String s) {
        int keyChange = 0;
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            char prevCh = s.charAt(i - 1);
            if (Character.toLowerCase(ch) != Character.toLowerCase(prevCh))
                keyChange++;
        }
        return keyChange;
    }
}