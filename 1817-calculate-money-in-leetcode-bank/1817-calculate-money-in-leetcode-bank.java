class Solution {
    public int totalMoney(int n) {
        //    \(S_{n}=\frac{n}{2}(2a+(n-1)d)\)

        int count = 1;
        double sum = 0;
        int week = n / 7;

        while (count <= week) {
            sum += 3.5 * ((2 * count) + 6);
            count++;
        }

        int daysLeft = n % 7;
        System.out.print(daysLeft);
        if (daysLeft > 0) {
            int n_1 = daysLeft - 1;
            sum += ((double) daysLeft / 2 * ((2 * count) + n_1));
        }
        return (int) sum;
    }
}