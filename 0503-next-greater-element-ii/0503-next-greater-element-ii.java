class Solution {
    public int[] nextGreaterElements(int[] nums) {

        // first traversal
        Stack<Integer> st= new Stack<>();
        int n= nums.length;

       for(int i= n-1;i>=0;i--){
        while(!st.isEmpty() && st.peek()<=nums[i]){
            st.pop();
        }
        st.push(nums[i]);
       }

       int [] res= new int [n];
       int i=n-1;
       while(i>=0){
        while(!st.isEmpty() && st.peek()<= nums[i]){
            st.pop();
        }
        if(st.isEmpty()){
            res[i]= -1;
            st.push(nums[i]);
            
        }
        else if (!st.isEmpty()&& st.peek()>nums[i]){
            res[i]=st.peek();
            st.push(nums[i]);
        }
        i--;


       }
       return res;
        
    }
}