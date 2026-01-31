class Solution {
    public int characterReplacement(String s, int k) {
        // k=3
        // "ABCBCYDDZDD"
        // output-> 7
        int maxLen=0;
        int i=0;
        int j=0;

        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        while(i<n && j<n){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);

            // Number of replacement
            int rep=(j-i+1)-maxFr(map);
            while(rep>k){
                char ch2=s.charAt(i);
                map.put(ch2,map.get(ch2)-1);
                i++;
                rep=(j-i+1)-maxFr(map);
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
    public int maxFr(Map<Character,Integer> map){
        int maxFreq=0;
        for(Map.Entry<Character,Integer> en: map.entrySet()){
            maxFreq=Math.max(maxFreq,en.getValue());
        }
        return maxFreq;
    }
}