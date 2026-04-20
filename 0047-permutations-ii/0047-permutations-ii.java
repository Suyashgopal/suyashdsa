class Solution {
    public List<List<Integer>> permuteUnique(int[] arr) {
         List<List<Integer>> outer = new ArrayList<>();
         ArrayList<Integer> li= new ArrayList<>();
         boolean[] used = new boolean[arr.length];
         Arrays.sort(arr);

fun(arr,outer,li,used);
return outer;

        
    }
    void fun(int[] arr, List<List<Integer>> outer , ArrayList<Integer> li , boolean[] used){
        if(li.size()==arr.length){
         outer.add(new ArrayList<>(li));
         return;
        }
        for(int i=0;i<arr.length; i++){
            if(used[i]){
                continue;
            }
            if(i>0 && arr[i]== arr[i-1] && !used[i-1]){
                continue;
            }

            used[i]= true;
            li.add(arr[i]);
            fun(arr,outer,li,used);
            used[i]= false;
            li.remove(li.size()-1);

        }
    }
}