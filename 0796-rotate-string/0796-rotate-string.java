class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            if ((goal.contains(s.substring(0, i + 1))) && goal.contains(s.substring(i + 1, s.length())))
                return true;
        }
        return false;
    }
}