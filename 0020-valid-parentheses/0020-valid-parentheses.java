class Solution {
    public boolean isValid(String s) {
        char[] c= s.toCharArray();
        Stack<Character> st= new Stack();
        for(int i=0;i<c.length;i++){
            if(c[i]=='('|| c[i]=='{'||c[i]=='['){
                st.push(c[i]);
            }
             if(c[i]=='}'|| c[i]==')'||c[i]==']'){
                if(st.isEmpty()){
                    return false;
                }
               if(c[i]=='}' && st.peek()!= '{'){
                return false;
               }
             else  if(c[i]==']'&& st.peek()!= '['){
                return false;
               }
              else   if(c[i]==')'&& st.peek()!= '('){
                return false;
               }

               st.pop();

            }
          
        }
          if(!st.isEmpty()){
                return false;
            }

            return true;
        
    }
}