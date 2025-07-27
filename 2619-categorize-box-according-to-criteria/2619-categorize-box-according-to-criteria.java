class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean heavy=false;
        boolean bulky=false;

        if(mass>=100)
            heavy=true;

        long volume=(long)length*width*height;

        if(length>=10000 || width>=10000 || height>=10000 || volume>=1000000000L)
            bulky=true;

        if(heavy && bulky)
            return "Both";
        else if(heavy)
            return "Heavy";
        else if(bulky)
            return "Bulky";
        
        return "Neither";
    }
}