public class solution_557 {
    public static void main(String[] args) {
        solution_557 solution = new solution_557();
        String s = "Let's take LeetCode contest";
        solution.reverseWords3(s);
    }

    public String reverseWords(String s) {
        String reverse = "";
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; ++i) {
            char[] word = words[i].toCharArray();
            for(int j = word.length - 1; j >= 0; --j) {
                reverse += word[j];
            }
            if(i != words.length - 1) 
                reverse += " ";
        }
        System.out.println(reverse + "]");
        return reverse;
    }

    public String reverseWords2(String s) {
        String reverse = "";
        char[] words = s.toCharArray();
        for(int i = words.length - 1; i >=0; --i) {
            reverse += words[i];
        }
        String[] reverseWords = reverse.split(" ");
        int lower = 0;
        int heigher = reverseWords.length - 1;
        while(lower < heigher) {
            String temp = reverseWords[lower];
            reverseWords[lower] = reverseWords[heigher];
            reverseWords[heigher] = temp;
            ++lower;
            --heigher;
        }
        reverse = "";
        for(int i = 0; i < reverseWords.length; ++i) {
            if(i != reverseWords.length - 1)
                reverse += reverseWords[i] + " ";
            else 
                reverse += reverseWords[i];
        }
        System.out.println(reverse + "]");
        return reverse;
    }

    public String reverseWords3(String s) {
        String[] words = s.split(" ");
        StringBuffer res = new StringBuffer();
        for(String item : words) {
            res.append(new StringBuffer(item + " ").reverse().toString());
        }
        System.out.println(res.toString().trim());
        return res.toString().trim();
    }
}