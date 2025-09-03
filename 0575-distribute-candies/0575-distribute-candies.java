class Solution {
    public int distributeCandies(int[] candyType) {

        int candyCanEat = candyType.length/2;
        HashSet<Integer> set = new HashSet<>();

        // iterate the whole array
        for(int i : candyType){
            set.add(i);
        }

        if(set.size()>=candyCanEat)
        return candyCanEat;

        return set.size();
    }
}