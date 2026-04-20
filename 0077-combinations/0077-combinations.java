class Solution {

    public List<List<Integer>> combine(int n, int k) {
        
         List<List<Integer>> outer= new ArrayList<>();
         ArrayList<Integer> li= new  ArrayList<>();
         fun(n,k,li,outer);
         return outer;

    }
    void fun(int n,int k,   ArrayList<Integer> al,List<List<Integer>> outer ){
        if(al.size()==k){
            outer.add(new ArrayList<>(al));
            return;

        }
        for(int i=1;i<=n;i++){
            if(al.contains(i)){
                continue;
            }
            if(al.size()>0 && i<=al.get(al.size()-1)){
                continue;
            }
            al.add(i);
            fun(n,k,al,outer);
            al.remove(al.size()-1);
        }
    }
}