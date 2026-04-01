import java.util.Stack;

class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> stMin;

    public MinStack() {
        st = new Stack<>();
        stMin = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (stMin.size()==0 || val <= stMin.peek()) {
            stMin.push(val);
        } else {
            stMin.push(stMin.peek());
        }
    }
    
    public void pop() {
       
            st.pop();
            stMin.pop();
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return stMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */