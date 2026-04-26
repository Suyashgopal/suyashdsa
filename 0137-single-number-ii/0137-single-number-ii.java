class Solution {
    public int singleNumber(int[] arr) {
    int res=0;
       for(int i=0;i<32;i++){
        int count=0;
        for(int j=0;j<arr.length;j++){
           int mask= arr[j]>>i;
            if((mask&1)==1){
              count++;
            }

        }
        if(count%3!=0){
         res= res| (1<<i);
        }
       } 



       return res;
    }
}