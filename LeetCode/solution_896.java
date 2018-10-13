public class solution_896 {
    public static void main(String[] args) {
        solution_896 solution = new solution_896();
        int[] A = new int[]{6,5,4,4,2};
        solution.isMonotonic(A);
    }

    public boolean isMonotonic(int[] A) {
        boolean descTrend = false;
        boolean asecTrend = false;
        for(int i = 1; i < A.length; ++i) {
            if(A[i] > A[i-1]) {
                asecTrend = true;
            } else if(A[i] < A[i-1]) {
                descTrend = true;
            }
        }
        System.out.println(!(asecTrend & descTrend));
        return !(asecTrend & descTrend);
    }

    public boolean isMonotonic2(int[] A) {
        if(A.length == 1) return true;

        int direction = 0;
        for(int i = 1 ; i < A.length - 1; ++i) {
            if(direction == 0) {
                direction = A[i] - A[i-1];
            }
            if(direction > 0 && A[i] < A[i-1]) return false;
            if(direction < 0 && A[i] > A[i-1]) return false;
        }
        return true;
    }
}