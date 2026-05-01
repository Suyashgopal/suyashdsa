class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //using bitmanipulation
        int n= nums.length;
        List<List<Integer>> outer=  new ArrayList<>(); 


        int last= (1<<n)-1;
        for( int i=0;i<=last;i++){
                  ArrayList<Integer> li= new ArrayList<>();

            for(int j=0;j<n;j++){
                if((i& (1<<j))!=0){
                    li.add(nums[j]);
                }
            }
            outer.add(li);
           

        }

    return outer;
        
    }
}