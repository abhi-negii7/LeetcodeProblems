class Solution {
    public int findPermutationDifference(String s, String t) {
        
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for(int i=0;i<s.length();i++){
            char ch1 =s.charAt(i);
            char ch2 =t.charAt(i);

            arr1[ch1-'a']=i;
            arr2[ch2-'a']=i;
        }
        int sum = 0;
         for(int i=0;i<s.length();i++){
            char ch1 =s.charAt(i);
            int diff = Math.abs(arr1[ch1-'a'] -  arr2[ch1-'a']);
            sum+=diff;
        }
        return sum;
    }
}