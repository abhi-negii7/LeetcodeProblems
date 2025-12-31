class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int s = Integer.MAX_VALUE;
        int l = 0;
        for (int i : nums) {
            s = Math.min(s, i);
            l = Math.max(l, i);
            set.add(i);
        }

        for (int i = s; i <= l; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}