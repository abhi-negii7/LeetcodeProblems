class Solution {
    public String reversePrefix(String s, int k) {
        char ch[] = s.toCharArray();
        int i = 0;
        while (i < k - i - 1) {
            char tempCh = ch[i];
            ch[i] = ch[k - i - 1];
            ch[k - i - 1] = tempCh;
            i++;
        }
        return new String(ch);
    }
}