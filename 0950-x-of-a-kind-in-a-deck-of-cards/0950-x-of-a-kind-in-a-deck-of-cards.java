class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2)
            return false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : deck) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int gcd = Integer.MIN_VALUE;

        for (int i : map.keySet()) {

            if (gcd == Integer.MIN_VALUE) {
                gcd = map.get(i);
            } else {
                gcd = findGcd(gcd, map.get(i));
                if (gcd<2)
                    return false;
            }
        }
        return true;
    }

    public int findGcd(int a, int b) {

        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0)
            return b;
        return a;
    }
}