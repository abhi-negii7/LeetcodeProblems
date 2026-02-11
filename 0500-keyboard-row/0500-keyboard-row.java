class Solution {
    public String[] findWords(String[] words) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            boolean sameRow = true;

            for (int j = 1; j < words[i].length(); j++) {

                char prev = words[i].charAt(j - 1);
                char ch = words[i].charAt(j);

                if (getRowNo(prev) != getRowNo(ch)) {
                    sameRow = false;
                    break;
                }
            }
            if (sameRow)
                list.add(words[i]);
        }

        String str[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            str[i] = list.get(i);
        }
        return str;
    }

    public int getRowNo(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'q' || ch == 'w' || ch == 'e' || ch == 'r' || ch == 't' || ch == 'y' || ch == 'u' || ch == 'i'
                || ch == 'o' || ch == 'p')
            return 1;
        else if (ch == 'a' || ch == 's' || ch == 'd' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k'
                || ch == 'l')
            return 2;
        return 3;
    }
}