class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (list.isEmpty() || nums[i] == list.get(list.size() - 1))
                count++;
            else
                count = 1;

            if (count <= k)
                list.add(nums[i]);
        }

        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        return arr;
    }
}