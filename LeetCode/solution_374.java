public class solution_374 {
    public static void main(String[] args) {}

    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(guess(mid) == 0)
                return mid;
            if(guess(mid) == 1)
                start = mid + 1;
            if(guess(mid) == -1)
                end = mid - 1;
        }
        return start;
    }
}