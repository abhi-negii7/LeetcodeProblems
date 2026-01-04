class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += findDivisorSum(nums[i]);
        }
        return sum;
    }

    public int findDivisorSum(int num) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                int anotherDigit = num / i;
                if (i != anotherDigit) {
                    sum += anotherDigit;
                    count++;
                }
                count++;
            }
        }
        if (count == 4)
            return sum;
        return 0;
    }
}