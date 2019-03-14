import java.util.Stack;

public class solution_739 {
    public static void main(String[] args) {
        solution_739 solution = new solution_739();
        int[] T = new int[]{96,43,74,63,41,95,48,46,89,72,34,85,72,59,87,49,30,32,47,34,74,58,31,75,73,88
            ,64,92,83,64,100,99,81,41,48,83,96,92,82,32,35,68,68,92,73,92,52,33,44,38,47,88,71,50,57,
            95,33,65,94,44,47,79,41,74,50,67,97,31,68,50,37,70,77,55,48,30,77,100,31,100};
        T = solution.dailyTemperatures(T);
        solution.print(T);
    }

    public int[] dailyTemperatures(int[] T) {
        if(T == null || T.length == 0)
            return T;
        
        for(int i = 0; i < T.length; ++i) {
            int futureDay = 0;
            boolean setFlag = false;
            for(int j = i; j < T.length; ++j) {
                if(T[j] > T[i]) {
                    T[i] = futureDay;
                    setFlag = true;
                    break;
                }
                ++futureDay;
            }
            if(!setFlag) {
                T[i] = 0;
            }
        }
        return T;
    }

    public void print(int[] T) {
        for(int num : T) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int[] dailyTemperatures2(int[] T) {
        if(T == null || T.length == 0)
            return T;
        int[] ans = new int[T.length];
        Stack<Integer> indexStack = new Stack<Integer>();
        for(int i = T.length; i > 0; --i) {
            while(!indexStack.isEmpty() && T[i] >= T[indexStack.peek()])
                indexStack.pop();
            ans[i] = indexStack.isEmpty() ? 0 : i - indexStack.peek();
            indexStack.push(i);
        }
        return ans;
    }
}