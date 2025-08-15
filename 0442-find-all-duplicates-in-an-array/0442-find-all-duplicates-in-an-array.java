class Solution {
    public List<Integer> findDuplicates(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int val = Math.abs(arr[i]);
            int idx = val - 1;

            // Duplicate element found
            if (arr[idx] < 0)
                list.add(val);
            // Duplicate element not found -> make it negative
            else
                arr[idx] = -arr[idx];
        }

        return list;
    }
}