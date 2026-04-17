class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {

List<List<Integer>> outer  = new  ArrayList<>();
 ArrayList<Integer> li = new  ArrayList<>();
 fun(arr,t,0,outer,li); 
return outer;
        
    }

void fun(int[] arr, int t, int idx,List<List<Integer>> outer , ArrayList<Integer> li ){
    if(idx==arr.length){
        if(t==0){
            outer.add(new ArrayList<>(li));

        }
        return;}
    if(arr[idx]<=t){
        li.add(arr[idx]);
        fun(arr, t-arr[idx],idx,outer,li);
        li.remove(li.size()-1);
    }
    

    fun(arr,t, idx+1,outer,li);
}



}
