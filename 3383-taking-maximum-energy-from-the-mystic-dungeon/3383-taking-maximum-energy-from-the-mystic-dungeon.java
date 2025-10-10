class Solution {
    public int maximumEnergy(int[] energy, int k) {

        int n = energy.length;
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (i + k < n)
                arr[i] = energy[i] + arr[i + k];
            else
                arr[i] = energy[i];
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}