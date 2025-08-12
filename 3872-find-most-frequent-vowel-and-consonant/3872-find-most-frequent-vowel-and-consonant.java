class Solution {
    public int maxFreqSum(String s) {
        
        char arr[] = new char[26];
        int vowelSum=0;
        int constSum=0;
        int finalSum=0;
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }

        for(int i=0;i<arr.length;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20)
            vowelSum=Math.max(vowelSum,arr[i]);

            else
            constSum = Math.max(constSum,arr[i]);
        }
        finalSum = vowelSum+ constSum;
        return finalSum;
    }
}