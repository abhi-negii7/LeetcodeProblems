class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int n = spells.length;
        int ans[] = new int[n];
        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            int val = search(potions, spells[i], success);
            ans[i] = (val == -1) ? 0 : potions.length - val;
        }

        return ans;
    }

    public int search(int arr[], int val, long success) {

        int low = 0;
        int high = arr.length - 1;
        int res = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (success <= (long) val * arr[mid]) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}