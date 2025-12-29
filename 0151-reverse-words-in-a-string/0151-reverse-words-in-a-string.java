class Solution {
    public String reverseWords(String s) {
        
        String str[] = s.split(" +");
        StringBuilder ansStr = new StringBuilder();

        for(int i=str.length-1;i>=0;i--){
            ansStr.append(str[i]);
            ansStr.append(' ');
        }
        return ansStr.toString().trim();
    }
}