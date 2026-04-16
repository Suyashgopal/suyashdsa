class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li= new ArrayList<>();
        ArrayList<Integer> al= new ArrayList<>();
        func(li,al,nums,0);
        return li;
        
        
    }
    void func(List<List<Integer>> li, ArrayList<Integer> al,int[] nums,int idx){
        if(idx== nums.length){
            li.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[idx]);
     func(li,al,nums,idx+1);
     al.remove(al.size()-1);
          func(li,al,nums,idx+1);


    

    }
}