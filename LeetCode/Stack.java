import java.util.*;

public class Stack<T> {
    private T top;
    private int length;
    private ArrayList<T> store;
    public Stack() {
        this.length = 0;
        store = new ArrayList<T>();
    }

    public T peek() {
        return this.top;
    }

    public void pop() {
        store.remove(this.length - 1);
        --this.length;
        if(this.length >= 1) {
            this.top = store.get(this.length - 1);
        } else {
            this.top = null;
        }
    }

    public void push(T node) {
        store.add(node);
        this.top = node;
        ++this.length;
    }

    public Boolean empty() {
        return store.isEmpty();
    }
}