public class solution_774 {
    public static void main(String[] args) {}
    
    public char nextGreatestLetter(char[] letters, char target) {
        char notFound = ' ';
        if(letters == null || letters.length == 0)
            return notFound;
        for(char c : letters)
            if(c > target)
                return c;
        return letters[0];
    }

    public char nextGreatestLetter2(char[] letters, char target) {
        char notFound = ' ';
        if(letters == null || letters.length == 0)
            return notFound;
        int start = 0;
        int end = letters.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(letters[mid] <= target)
                start = mid + 1;
            if(letters[mid] > target)
                end = mid - 1;
        }
        return letters[start % letters.length];
    }
}