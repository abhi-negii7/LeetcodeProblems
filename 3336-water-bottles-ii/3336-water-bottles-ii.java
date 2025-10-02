class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {

        int emptyBottle = numBottles;
        int drinkWater = numBottles;

        while (emptyBottle >= numExchange) {

            emptyBottle -= numExchange;
            drinkWater++;
            emptyBottle+=1;
            numExchange++;
        }
        return drinkWater;
    }
}