class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        List<List<Integer>> outer= new ArrayList<>();
        if(n<k){
            return outer;
        }
 fun(li,outer,n,k);
 return outer;
        
        
    }
    void fun(  ArrayList<Integer> li,List<List<Integer>> outer, int n,int k){
        if(li.size()==k){
            outer.add(new ArrayList<>(li));
            return;
        }
        for(int i=1;i<=n;i++){
            if(li.contains(i)){
                continue;
                            }
         if(li.size()>0 && i<li.get(li.size()-1)){
            continue;
         }
          li.add(i);

          fun(li,outer,n,k);
          li.remove(li.size()-1);

        }
    }
}