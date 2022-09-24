class Solution {
    public static int swapBitGame(long N) {
        // code here
         long xo = 0;
        long o = 0;
        while(N != 0){
            if(N%2 != 0 && o > 0){
                xo ^= o;
            }
            if(N%2 == 0) o++;
            N/=2;
        }
        if(xo!=0) return 1;
        else return 2;
    }
}