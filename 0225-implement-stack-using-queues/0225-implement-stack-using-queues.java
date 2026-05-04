class MyStack {
          Queue<Integer> q1;
                Queue<Integer> q2;

    public MyStack() {
      this.q1= new LinkedList<>();
       this.q2= new LinkedList<>();
  }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            int k= q1.remove();
            q2.add(k);

        }
        q1.add(x);
        while(!q2.isEmpty()){
            int s= q2.remove();
            q1.add(s);
        }
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
     return q1.remove();
        
    }
    
    public int top() {
        return q1.peek();

        
    }
    
    public boolean empty() {
return q1.isEmpty();        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */