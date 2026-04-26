class Solution {
    public int minBitFlips(int a, int b) {
        int x= a^b;
        int c=0;
        while(x>0){
            
            if((x&1)==1){
                c++;

            }
            x=x>>1;

        }
        return c;
    }
}