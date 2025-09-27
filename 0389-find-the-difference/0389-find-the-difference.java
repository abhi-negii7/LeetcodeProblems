class Solution {
    public char findTheDifference(String s, String t) {

        char res = 0;
        for(int i : s.toCharArray()){
            res^=i;
        }
        for(int i : t.toCharArray()){
           res^=i;
        }
        return res;

    }
}