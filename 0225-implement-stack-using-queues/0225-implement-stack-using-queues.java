class MyStack {
  Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        if(q.size()==0) q.add(x);
        else{
            q.add(x);
            for(int i=1;i<=q.size()-1;i++){
           q.add(q.remove());
       }
        }
         
      
    }
    
    public int pop() {
      return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
      if(q.size()==0) return true;
      else return false;  
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

 //2nd method
 // class MyStack {
//     private Queue<Integer> main;
//     private Queue<Integer> helper;
//     public MyStack() {
//         main = new LinkedList<>();
//         helper = new LinkedList<>();
//     }
    
//     public void push(int x) {
//         //moving all elements from main to helper
//         while(main.size()>0){
//             helper.add(main.remove());
//         }
//         // add X in main queue
//         main.add(x);
//         // moving all elements from helper to main
//         while(helper.size()>0){
//             main.add(helper.remove());
//         }
//     }
    
//     public int pop() {
//         return main.remove();
//     }
    
//     public int top() {
//         return main.peek();
//     }
    
//     public boolean empty() {
//         if(main.size()==0){
//             return true;
//         }
//         else {
//             return false;
//         }
//     }
// }

// /**
//  * Your MyStack object will be instantiated and called as such:
//  * MyStack obj = new MyStack();
//  * obj.push(x);
//  * int param_2 = obj.pop();
//  * int param_3 = obj.top();
//  * boolean param_4 = obj.empty();
//  */