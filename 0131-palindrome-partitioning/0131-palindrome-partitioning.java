class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> outer= new ArrayList<>();
        ArrayList<String> al= new ArrayList<>();


            fun(0,s,al,outer);
            return outer;

        
    }

    void fun(int idx ,String s,ArrayList<String> al,List<List<String>> outer){

        if(idx==s.length()){
            outer.add(new ArrayList<>(al));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(ispal(s,idx,i)){
                al.add(s.substring(idx,i+1));
                    fun(i+1,s,al,outer);
                   al.remove(al.size()-1);
             
                 
            }
         
          
          
        }

    }

    boolean ispal(String s, int st,int end){
       
       
        while(st<end){
            if(s.charAt(st)!= s.charAt(end)){
                return false;
            }st++;
            end--;
        }
return true;}


}