class Solution {
    public int findClosest(int x, int y, int z) {
        
        int dis1 = Math.abs(z-x);
        int dis2 = Math.abs(z-y);

        if(dis1==dis2)
        return 0;
        if(dis1>dis2)
        return 2;
        return 1;
    }
}