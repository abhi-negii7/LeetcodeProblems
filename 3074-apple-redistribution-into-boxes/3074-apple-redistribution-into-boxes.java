class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        Arrays.sort(capacity);

        int totalApple = 0;
        for (int i : apple) {
            totalApple += i;
        }

        int boxCapacity = 0;
        int boxCount = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            boxCount++;
            boxCapacity += capacity[i];
            if (boxCapacity >= totalApple)
                break;
        }
        if (boxCapacity >= totalApple)
            return boxCount;
        return -1;
    }
}