class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int i = 0;
        int j = skill.length-1;
        long prod = 0;
        int prev = 0;
        while (i < j) {
            if(prev==0){
                prev = skill[i]+skill[j];
            }
            else if(prev!=0 && prev!=skill[i]+skill[j]){
                return -1;
            }
            prod += ((long)skill[i]*skill[j]);
            i++;
            j--;
        }
        return prod;
    }
}