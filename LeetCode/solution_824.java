public class solution_824 {
    public static void main(String[] args) {
        solution_824 solution = new solution_824();
        String s = "I speak Goat Latin";
        solution.toGoatLatin(s);
    }

    public String toGoatLatin(String s) {
        String result = new String();
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; ++i) {
            StringBuffer stringbuffer = new StringBuffer(arr[i]);
            if(!isVowel(stringbuffer.charAt(0))) {
                stringbuffer.append(stringbuffer.charAt(0));
                stringbuffer = stringbuffer.delete(0, 1);
            }
            stringbuffer.append(generateMa(i+1));
            result += stringbuffer.toString() + " ";
        }
        return result.trim();
    }

    public boolean isVowel(char c) {
        String s = "aeiou";
        return s.indexOf(String.valueOf(c).toLowerCase()) != -1;
    }

    public String generateMa(int n) {
        String s = "ma";
        while(n > 0) {
            s += "a";
            --n;
        }
        return s;
    }
}