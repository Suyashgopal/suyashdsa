class Solution {
    public List<List<Integer>> combinationSum3(int k, int t) {
    
        
   
    List<List<Integer>> outer = new ArrayList<>();
    ArrayList<Integer> li= new ArrayList<>();
    if(k>=t){
        return outer;
    }
    fun(li, 1,k,t,outer);
    return outer;
    }
    void fun(ArrayList<Integer>li,int idx,int k,int t, List<List<Integer>> outer  ){
        if(li.size()== k){
            if(t==0){
                outer.add(new ArrayList<>(li));
            }
            return;
        }
        if(idx<10 && idx<=t){
            li.add(idx);
            fun(li, idx+1,k,t -idx,outer);
            li.remove(li.size()-1);


        }
        if(idx<10){ 
        fun(li,idx+1,k,t,outer);

        }

    }

    
}