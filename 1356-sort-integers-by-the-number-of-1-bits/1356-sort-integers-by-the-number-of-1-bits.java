class Solution {
    public int[] sortByBits(int[] arr) {


        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(bit(arr[j])<bit(arr[j-1])){
                   swap(j,j-1,arr);

                }
                if(bit(arr[j])==bit(arr[j-1])  && arr[j]<arr[j-1]){
                   swap(j,j-1,arr);
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
  arr[a]= arr[b]^arr[a];
    arr[b]=arr[b]^arr[a];
    arr[a]= arr[b]^arr[a];
 }
}