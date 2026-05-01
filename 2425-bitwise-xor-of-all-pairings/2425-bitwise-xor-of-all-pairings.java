class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2= nums2.length;
        int x1=0;
        int x2=0;
        for(int i=0;i<n1;i++){
          x1=x1^nums1[i];

        }
        for(int i=0;i<n2;i++){
          x2=x2^nums2[i];
          
        }
        if(n1%2==0){
        x2=0;
        }
        if(n2%2==0){
         x1=-0;
        }

        return x1^x2;
        
        
    }
}