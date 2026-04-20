class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>();
        fun(arr,t,0,li, outer);
        return outer;





        
    }
    void fun(int[] arr, int t,int idx, ArrayList<Integer> al, List<List<Integer>> outer){
        if(idx==arr.length){
            if(t==0){
            outer.add(new ArrayList<>(al));  }
            return;
        }

            if(arr[idx]<= t){
          al.add(arr[idx]);
          fun(arr,t-arr[idx],idx,al, outer);
            al.remove(al.size()-1);

            }
           


        

        
      
        fun(arr,t,idx+1,al, outer);



    }
}