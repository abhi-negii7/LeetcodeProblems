class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWord = 0;
        for (String str : sentences) {
            String st[] = str.split(" +");
            maxWord = Math.max(maxWord, st.length);
        }
        return maxWord;
    }
}