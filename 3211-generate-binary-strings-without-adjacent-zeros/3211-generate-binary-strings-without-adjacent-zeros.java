


class Solution {
    public List<String> validStrings(int n) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> li= new ArrayList<>();
    fun(sb,li,n);
    return li;


        
    }
    void fun( StringBuilder sb,ArrayList<String> li ,int n){
        if(sb.length()== n){
            li.add(sb.toString());
            return;
        }
          sb.append('1');
       fun(sb,li,n);
  sb.deleteCharAt(sb.length()-1);


       if(sb.length()==0|| sb.charAt(sb.length()-1)!='0'){
        sb.append('0');
          fun(sb,li,n);
            sb.deleteCharAt(sb.length()-1);

          }




        


    }
}