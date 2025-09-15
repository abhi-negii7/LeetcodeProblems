class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int i=0;
        int j=0;

        StringBuilder st = new StringBuilder();
        while(i<n && j<m){
            st.append(word1.charAt(i++));
            st.append(word2.charAt(j++));
        }

        while(i<n){
             st.append(word1.charAt(i++));
        }
          while(j<m){
           st.append(word2.charAt(j++));
        }
        return st.toString();
    }
}