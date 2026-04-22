class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> outer= new ArrayList<>();
char[][] b= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              b[i][j]='.';
              }
     }
        fun(b, outer,0,n);
        return outer;

    }

    void fun(char[][] b ,List<List<String>> outer, int row, int n){
        if(row==n){
            //convert the char array to string list
            //add to outer
       ArrayList<String> list = new ArrayList<>();

            for(int i = 0; i < n; i++){
    list.add(new String(b[i]));
}
   outer.add(new ArrayList<>(list));
      
            return;

        }

        for(int col= 0;col<n;col++){
            if(valid(b,row,col,n)){
              b[row][col]='Q';
              fun(b,outer,row+1,n);
              b[row][col]='.';
            }
        }
    }

    boolean valid(char[][] b, int row, int col, int n){

        if(row==0){
            return true;
        }
           //col check 
            for(int i=0;i<row;i++){
                if(b[i][col]=='Q'){
                    return false;
                }
            }
            //left dig check
           int ldr=row;
           int rdc= col;
           while(ldr>=0 && rdc>=0){
            if(b[ldr][rdc]=='Q'){
                return false;
            }
            ldr--;
            rdc--;
           }
           //right dig check
           int drow= row;
           int dcol= col;
           while(drow>=0 && dcol<n){
            if(b[drow][dcol]=='Q'){
                return false;
            }
            drow--;
            dcol++;
           }
     return true;

    }
}