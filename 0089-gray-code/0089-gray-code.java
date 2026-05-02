class Solution {
    public List<Integer> grayCode(int n) {
         if(n==1){
         ArrayList<Integer> list = new ArrayList<>();
         list.add(0);
         list.add(1);
         return list;
            }

            List <Integer> dummy= grayCode(n-1);
         ArrayList<Integer> my = new ArrayList<>();

         int m1=0<<(n-1);
         for(int i=0;i<dummy.size();i++){
            int num= m1| dummy.get(i);
            my.add(num);
         }
       int m2=1<<(n-1);
         for(int i=dummy.size()-1;i>=0;i--){
            int num= m2| dummy.get(i);
            my.add(num);
         }

  
  
         return my; 

    }


    
}