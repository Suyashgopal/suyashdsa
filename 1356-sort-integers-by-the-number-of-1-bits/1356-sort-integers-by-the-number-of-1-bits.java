class Solution {
    public int[] sortByBits(int[] arr) {
        int n= arr.length;
 int[] bits = new int [n];

 for( int i=0;i<n;i++){
    bits[i]=bit(arr[i]);
 }

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(bits[j]<=bits[j-1]){
                    if(bits[j]<=bits[j-1]){
swap(j,j-1,arr);
swap(j,j-1,bits);
                    }
                   
                  if(bits[j]==bits[j-1]  && arr[j]<arr[j-1]){
                   swap(j,j-1,arr);
                   swap(j,j-1,bits);
                }
                }
                
            }
        }
        return arr;
        
    }
int bit(int n){
    int count=0;
    while (n>0){
    if((n&1)==1){
        count++;
    }
    n= n>>1;
    }
    return count;

}
 void swap( int a, int b, int[] arr){
   int temp= arr[a];
   arr[a]=arr[b];
   arr[b]=temp;
 }
}