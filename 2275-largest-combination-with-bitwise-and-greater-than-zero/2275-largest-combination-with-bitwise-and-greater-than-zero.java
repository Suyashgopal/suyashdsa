class Solution {
    public int largestCombination(int[] arr) {
        int n= arr.length;
      int res=0;
      for(int i=0;i<30;i++){
        int mask= 1<<i;
        int count=0;
        for(int j=0;j<n;j++){
           if((arr[j]&mask)!=0){
            count++;
           }
        }
        res= Math.max(res, count);
      }
       return res;
    }
   
}