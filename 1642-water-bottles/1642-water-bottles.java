class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int newBottles = numBottles;
        int totalDrink = numBottles;

        while (newBottles != 0) {

            int canDrink = newBottles / numExchange;
            int rem = newBottles > numExchange ? newBottles % numExchange : 0;
            totalDrink += canDrink;

            newBottles = canDrink + rem;
        }

        return totalDrink;

    }
}