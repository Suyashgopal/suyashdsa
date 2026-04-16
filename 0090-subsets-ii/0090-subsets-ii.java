class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
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
        int next= idx+1;
        while(next<nums.length && nums[next]==nums[idx]){
            next++;
        }
          func(li,al,nums,next); 
     
 }
}