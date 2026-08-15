class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int el1 = Integer.MIN_VALUE, count1 = 0;
        int el2 = Integer.MIN_VALUE, count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count1 == 0 && el2 != nums[i]) {
                el1 = nums[i];
                count1++;
            } else if (count2 == 0 && el1 != nums[i]) {
                el2 = nums[i];
                count2++;
            } else if (nums[i] == el1)
                count1++;
            else if (nums[i] == el2)
                count2++;
            else {
                count1--;
                count2--;
            }
        }

        int count1Occ = 0;
        int count2Occ = 0;

        for (int i = 0; i < nums.length; i++) {
            if (el1 == nums[i])
                count1Occ++;
            else if (el2 == nums[i])
                count2Occ++;
        }
        if (count1Occ > nums.length / 3)
            list.add(el1);
        if (count2Occ > nums.length / 3)
            list.add(el2);

        return list;

    }
}