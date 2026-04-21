class Solution {
    public boolean exist(char[][] b, String word) {
        char[] w= word.toCharArray();
          int r= b.length;
        int c= b[0].length;
     
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(b[i][j]==w[0] && find(b,w,0,i,j)){
                    return true;
                }
            }
        }
        return false;
        
    }
    boolean  find(char[][] b, char[] w,int idx, int i, int j){

        if(idx== w.length){
            return true;
        }
           int r= b.length;
        int c= b[0].length;
        if(i<0|| i>=r||j<0||j>=c|| b[i][j]=='1'){
            return false;

        }
        
          if(b[i][j]!= w[idx]){
            return false;
          }
           
            char k = b[i][j];
            b[i][j]='1';
           boolean x=    find(b,w,idx+1,i+1,j)|| find(b,w,idx+1,i,j+1) || find(b,w,idx+1,i-1,j) || find(b,w,idx+1,i,j-1);

               
            b[i][j]=k;        
     return x;}}