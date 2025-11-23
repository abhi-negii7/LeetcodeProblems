class Solution {
    public String restoreString(String s, int[] indices) {

        char chArr[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            chArr[indices[i]] = ch;
        }
        return new String(chArr);
    }
}