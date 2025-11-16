class Solution {
    public int numSub(String s) {
        long maxCount=0;
        long count=0;
        int mod = 1_000_000_007;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='1'){
                count++;
                maxCount=(maxCount+count)%mod;
            }
            else{
                count=0;
            }
        }
        return (int)(maxCount%mod);
    }
}