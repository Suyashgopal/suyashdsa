class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> li= new ArrayList<>();

StringBuilder sb= new StringBuilder();
  


      fun(sb,li,'(',')',0,0,n);
      return li;  
    }
    
    
    void fun(StringBuilder sb , ArrayList<String> li,char o, char c, int on,int cn ,int n){
        if(sb.length()==2*n){
            li.add(sb.toString());
            return;}
            if(on<n){
                sb.append(o);
                fun(sb,li,o,c,on+1,cn,n);
                sb.deleteCharAt(sb.length() - 1);
            }
            if(cn<on){
                sb.append(c);
                fun(sb,li,o,c,on,cn+1,n);
                sb.deleteCharAt(sb.length() - 1);
            }
        





    }
}