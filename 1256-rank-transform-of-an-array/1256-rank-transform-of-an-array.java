class Solution {
    public int[] arrayRankTransform(int[] arr) {

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i : set) {
            map.put(i, rank);
            rank++;
        }

        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}