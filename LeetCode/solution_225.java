import java.util.Queue;

public class solution_225<T> {

    private Queue<T> masterQueue;
    private Queue<T> slaverQueue;
    public static void main(String[] args) {

    }

    public solution_225() {
        masterQueue = new Queue<T>();
        slaverQueue = new Queue<T>();
    }

    public void push(T x) {
        if(slaverQueue.isEmpty()) {
            masterQueue.add(x);
        } else {
            
        }
    }
}