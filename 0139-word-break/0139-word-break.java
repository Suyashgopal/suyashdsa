class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] memo= new Boolean[s.length()];
      return   fun(s,wordDict,0,memo);

        //same index we explore multipe times
          }
          boolean fun(String s,List<String> dict, int idx,Boolean[] memo){
            if(idx==s.length()){
                return true;
            }
            if(memo[idx]!= null){
                return memo[idx];
            }
            for(int i=0;i<dict.size();i++){
                String match = dict.get(i);
                if(checkfull(s,match,idx)){
                 if(fun(s,dict,idx+match.length() ,memo))   {
                    memo[idx]= true;
                    return true;
                 }
               }
                
                
                }
                memo[idx]= false;
                  return false;
          }
          
           boolean checkfull(String s, String m, int idx){
            if(idx+ m.length()>s.length()){
                return false;
            }
            String temp = s.substring(idx,idx+ m.length());
            return temp.equals(m);
           }
          
          }