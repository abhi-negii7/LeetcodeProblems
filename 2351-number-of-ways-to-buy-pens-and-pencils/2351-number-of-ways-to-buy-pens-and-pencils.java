class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {

        int remaining = total;
        long totalWays = 0;
        int maxCost = Math.max(cost1,cost2);
        int minCost = Math.min(cost1,cost2);

        while (remaining >= 0) {
            int currWays = remaining / minCost;
            totalWays += currWays + 1;
            remaining -= maxCost;
        }
        return totalWays;
    }
}