class Solution {
    public int countBalls(int lowLimit, int highLimit) {

        HashMap<Integer, Integer> map = new HashMap<>();

        while (lowLimit <= highLimit) {

            int temp = lowLimit;
            int sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            lowLimit++;
        }

        int max = 0;
        for (int i : map.keySet()) {
            max = Math.max(max, map.get(i));
        }
        return max;
    }
}