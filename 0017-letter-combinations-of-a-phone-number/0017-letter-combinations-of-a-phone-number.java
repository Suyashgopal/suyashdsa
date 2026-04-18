class Solution {
    public List<String> letterCombinations(String dig) {
        HashMap<Character,String> map= new HashMap<>();
      map.put('2',"abc");
            map.put('3',"def");
      map.put('4',"ghi");
      map.put('5',"jkl");
      map.put('6',"mno");
      map.put('7',"pqrs");
      map.put('8',"tuv");
      map.put('9',"wxyz");
      ArrayList<String> li = new ArrayList<>();
      StringBuilder sb = new StringBuilder();
      fun(dig,map,sb,0,li);


     return li;
     

        
    }
 void fun(String dig ,HashMap<Character,String> map,StringBuilder p, int idx, ArrayList<String> li)
 {
    if(idx==dig.length()){
        li.add(p.toString());

        return;

    }
    String combo = map.get(dig.charAt(idx));
    for(int i=0;i<combo.length();i++){
        p.append(combo.charAt(i));
        fun(dig,map,p,idx+1,li);
        p.deleteCharAt(p.length()-1);


    }
  
    


 }
}