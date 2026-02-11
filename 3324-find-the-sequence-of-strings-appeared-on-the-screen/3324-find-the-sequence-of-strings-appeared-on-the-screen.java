class Solution {
    public List<String> stringSequence(String target) {
        StringBuilder str = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < target.length(); i++) {

            char currCh = target.charAt(i);
            for (char ch = 'a'; ch <= currCh; ch++) {
                str.append(ch);
                list.add(str.toString());
                str.deleteCharAt(str.length() - 1);
            }
            str.append(currCh);
        }
        return list;
    }
}