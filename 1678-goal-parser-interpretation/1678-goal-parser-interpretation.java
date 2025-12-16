class Solution {
    public String interpret(String command) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            char currCh = command.charAt(i);
            if (currCh == 'G')
                str.append('G');
            else if (currCh == ')') {
                char prevCh = command.charAt(i - 1);
                if (prevCh == '(')
                    str.append('o');
                else
                    str.append("al");
            }
        }
        return str.toString();
    }
}