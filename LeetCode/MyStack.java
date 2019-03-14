import java.util.Queue;
import java.util.ArrayDeque;

class MyStack {

    private Queue<Integer> first = null;
    private Queue<Integer> second = null;
    
    /** Initialize your data structure here. */
    public MyStack() {
        first = new ArrayDeque<Integer>();
        second = new ArrayDeque<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(!first.isEmpty()) {
            first.add(x);
        } else {
            second.add(x);
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(first.isEmpty() && second.isEmpty()) 
            return -1;
        int popNum = -1;
        if(!first.isEmpty()) {
            int size = first.size();
            while(size > 1) {
                second.add(first.remove());
                --size;
            }
            popNum = first.remove();
        } else {
            int size = second.size();
            while(size > 1) {
                first.add(second.remove());
                --size;
            }
            popNum = second.remove();
        }
        return popNum;
    }
    
    /** Get the top element. */
    public int top() {
        if(first.isEmpty() && second.isEmpty()) 
            return -1;
        int popNum = -1;
        if(!first.isEmpty()) {
            int size = first.size();
            while(size > 1) {
                second.add(first.remove());
                --size;
            }
            popNum = first.remove();
            second.add(popNum);
        } else {
            int size = second.size();
            while(size > 1) {
                first.add(second.remove());
                --size;
            }
            popNum = second.remove();
            first.add(popNum);
        }
        return popNum;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
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