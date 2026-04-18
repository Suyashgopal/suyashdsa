class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
if(nums.length==0){
    return outer;
}
      fun(al,outer,nums);
      return outer;
    }
    void fun(  ArrayList<Integer> al,List<List<Integer>> outer,int [] nums ){
        if(al.size()== nums.length){
            outer.add(new ArrayList<> (al));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(al.contains(nums[i])){
                continue;
            }
            al.add(nums[i]);
            fun(al,outer,nums);
            al.remove(al.size()-1);

        }

    }
}