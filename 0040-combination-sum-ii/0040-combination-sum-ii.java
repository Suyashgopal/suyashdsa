class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        Arrays.sort(arr);

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
        fun(arr, t-arr[idx],idx+1,outer,li);
        li.remove(li.size()-1);
    }
    
        int next= idx;
        while(next <arr.length && arr[next]== arr[idx]){
            next++;
        }
    fun(arr,t, next,outer,li);
}



}
