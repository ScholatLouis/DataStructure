import java.util.Map;
import java.util.HashMap;

public class solution_454 {
    public static void main(String[] args) {}

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; ++i) {
            for(int j = 0; j < B.length; ++j) {
                int sum = A[i] + B[j];
                hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
            }
        }

        int result = 0;
        for(int i = 0; i < C.length; ++i) {
            for(int j = 0; j < D.length; ++j) {
                int sum = C[i] + D[j];
                result += hashMap.getOrDefault(-sum, 0);
            }
        }
        return result;
    }
}