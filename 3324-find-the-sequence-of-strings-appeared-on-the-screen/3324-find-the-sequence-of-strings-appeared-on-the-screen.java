class Solution {
    public List<String> stringSequence(String target) {
        StringBuilder str = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < target.length(); i++) {

            char currCh = target.charAt(i);
            for (char ch = 'a'; ch <= currCh; ch++) {
                list.add(str.toString() + ch);
            }
            str.append(currCh);
        }
        return list;
    }
}