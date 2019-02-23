public class solution_155 {

    private int min;
    private Stack<Integer> minStack;
    private Stack<Integer> dataStack;

    public static void main(String[] args) {

    }

    public solution_155() {
        min = Integer.MAX_VALUE;
        minStack = new Stack<Integer>();
        dataStack = new Stack<Integer>();
    }

    public void push(int x) {
        dataStack.push(x);
        if(x < min) {
            min = x;
        }
        minStack.push(min);
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
        if(!minStack.empty()) {
            min = minStack.peek();
        } else {
            min = Integer.MAX_VALUE;
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return min;
    }
}