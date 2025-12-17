class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWord = 0;
        for (String str : sentences) {
            maxWord = Math.max(maxWord,wordFound(str));
        }
        return maxWord;
    }

    public int wordFound(String str){
        int words = 1;
        for(char ch : str.toCharArray() ){
            if(ch==' ')
            words++;
        }
        return words;
    }
}