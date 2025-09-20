class Solution {
    public String reverseWords(String s) {

        s=s.trim();
        String str[] = s.split("\\s+");
        int j = str.length - 1;
       StringBuilder ans = new StringBuilder();
        while (j >= 0) {
           ans.append(str[j--]);
           ans.append(" ");
        }
        return ans.toString().trim();
    }
}