public class solution_292 {
    public static void main(String[] args) {
        solution_292 solution = new solution_292();
        int n = 5;
        solution.canwingame(n);
    }

    public boolean canwingame(int n) {
        return n % 4 != 0;
    }
}