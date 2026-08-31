class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (list1.get(list1.size() - 1) > list2.get(list2.size() - 1)) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }
        int ans[] = new int[list1.size() + list2.size()];
        int idx = 0;
        for (int num : list1) {
            ans[idx] = num;
            idx++;
        }
        for (int num : list2) {
            ans[idx] = num;
            idx++;
        }

        return ans;
    }
}