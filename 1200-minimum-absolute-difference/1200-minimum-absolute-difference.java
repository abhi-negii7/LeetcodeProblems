class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1]<minDiff) {
                minDiff=arr[i]-arr[i-1];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                ansList.add(new ArrayList<>(Arrays.asList(arr[i - 1], arr[i])));
            }
        }
        return ansList;
    }
}