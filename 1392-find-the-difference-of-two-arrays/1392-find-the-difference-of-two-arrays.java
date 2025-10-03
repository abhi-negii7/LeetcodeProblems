class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i : set1) {
            if (!set2.contains(i))
                list1.add(i);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i : set2) {
            if (!set1.contains(i))
                list2.add(i);
        }

        ans.add(list1);
        ans.add(list2);

        return ans;

    }
}