class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(nums[1]);
        int list2Idx=0;

        for (int i = 2; i < nums.length; i++) {
            if (list1.get(list1.size() - 1) > nums[list2Idx]) {
                list1.add(nums[i]);
            } else {
                nums[++list2Idx] = nums[i];
            }
        }
        for (int num : list1) {
            nums[++list2Idx] = num;
        }

        return nums;
    }
}