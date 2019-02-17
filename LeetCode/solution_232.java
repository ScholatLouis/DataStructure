import java.util.List;
import java.util.ArrayList;

public class solution_232<T> {

    private List<T> inputStack;
    private List<T> outputStack;

    public static void main(String[] args) {
        solution_232<Integer> myStack = new solution_232<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " ");
        myStack.push(4);
        System.out.println(myStack.pop() + " ");
        System.err.println(myStack.empty());
    }

    public solution_232() {
        inputStack = new ArrayList<T>();
        outputStack = new ArrayList<T>();
    }

    public void push(T x) {
        inputStack.add(x);
    }

    public T pop() {
        if(inputStack.isEmpty() && outputStack.isEmpty()) {
            return null;
        }
        if(outputStack.isEmpty()) {
            for(int j = inputStack.size() - 1; j >=0; --j) {
                outputStack.add(inputStack.remove(j));
            }
        }
        return outputStack.remove(outputStack.size() - 1);
    }

    public T top() {
        if(inputStack.isEmpty() && outputStack.isEmpty()) {
            return null;
        }
        if(outputStack.isEmpty()) {
            for(int j = inputStack.size() - 1; j >= 0; --j) {
                outputStack.add(inputStack.remove(j));
            }
        }
        return outputStack.get(outputStack.size() - 1);
    }

    public Boolean empty() {
        if(inputStack.isEmpty() && outputStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}