class Solution {
    public String sortVowels(String s) {

        StringBuilder vowel = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (isVowel(ch))
                vowel.append(ch);
        }
        char chArr[] = vowel.toString().toCharArray();
        Arrays.sort(chArr);

        int i = 0;
        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                ans.append(chArr[i++]);
            } else
                ans.append(ch);
        }

        return ans.toString();

    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U')
            return true;
        return false;
    }
}