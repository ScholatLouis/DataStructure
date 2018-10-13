import java.util.HashSet;

public class solution_804 {
    public static void main(String[] args) {
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        uniqueMorseRepresentations(words);
    }

    public static int uniqueMorseRepresentations(String[] words) {
        HashSet<String> different = new HashSet<String>();
        String[] str = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i = 0; i < words.length; ++i) {
            String code = "";
            char[] word = words[i].toCharArray();
            for(char item : word) {
                code += str[item - 'a'];
                System.out.print(code);
            }
            if(!different.contains(code)) {
                different.add(code);
            }
        }
        System.out.println(different.size());
        return different.size();
    }
    
    public static int uniqueMorseRepresentations2(String[] words) {
        HashSet<String> different = new HashSet<String>();
        String[] str = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i = 0; i < words.length; ++i) {
            String code = "";
            for(char item : words[i].toCharArray()) {
                code += str[item - 'a'];
            }
            different.add(code);
        }
        return different.size();
    }
}