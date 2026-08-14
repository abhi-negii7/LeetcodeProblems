class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ansList = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>(i + 1);
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int res = ansList.get(i - 1).get(j) + ansList.get(i - 1).get(j - 1);
                    list.add(res);
                }
            }
            ansList.add(list);
        }
        return ansList;
    }
}