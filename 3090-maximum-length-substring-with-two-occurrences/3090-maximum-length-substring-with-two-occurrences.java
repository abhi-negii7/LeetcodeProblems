class Solution {
    public int maximumLengthSubstring(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int maxLen = Integer.MIN_VALUE;

        for(int j=0;j<s.length();j++){
            char currCh = s.charAt(j);
            map.put(currCh,map.getOrDefault(currCh,0)+1);
            while(map.get(currCh)>2){
                char prevCh = s.charAt(i);
                map.put(prevCh,map.get(prevCh)-1);
                if(map.get(prevCh)==0) map.remove(prevCh);
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}