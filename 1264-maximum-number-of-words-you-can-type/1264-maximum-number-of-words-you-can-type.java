class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        int count = 0;
        // To store the broken letters
        int arr[] = new int[26];
        // To split the string on the bases of spaces
        String st[] = text.split("\\s+");
        // To store the brokenLetters into the array
        for (char ch : brokenLetters.toCharArray()) {
            arr[ch - 'a'] = 1;
        }

        for (int i = 0; i < st.length; i++) {
            boolean flag = true;
            for (char ch : st[i].toCharArray()) {
                if (arr[ch - 'a'] == 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}