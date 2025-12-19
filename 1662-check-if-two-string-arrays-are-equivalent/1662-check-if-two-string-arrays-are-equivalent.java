class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        int arr1[] = new int[26];

        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            for (int j = 0; j < word1[i].length(); j++) {
                char ch = word1[i].charAt(j);
                str1.append(ch);
            }
        }

        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < word2.length; i++) {
            for (int j = 0; j < word2[i].length(); j++) {
                char ch = word2[i].charAt(j);
                str2.append(ch);

            }
        }
        return (str1.toString().equals(str2.toString()));

    }
}