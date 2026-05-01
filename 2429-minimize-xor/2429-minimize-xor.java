class Solution {
    public int minimizeXor(int n1, int n2) {

        //count set bits in n2
        int k= n2;
        int count=0;
        while(k>0){
            k= k&(k-1);
            count++;}
            int res=0;

            for(int i=30;i>=0;i--){
                int mask= 1<<i;
                if((n1&mask)!=0){
                    res= res+ mask;
                    count--;
                }
                if(count==0){
                   return res;
                }

            }
            //count>0
            int l=0;
            while(count >0){
                int mask=1<<l;
                if((mask & res)==0){
                    res= res+mask;
                    count--;
                }
                l++;

            }
          
        
        return res;
    }
}