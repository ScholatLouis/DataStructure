import java.util.List;
import java.util.ArrayList;

public class solution_500 {
    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        findWords(words);
    }


    public static String[] findWords(String[] words) {
        List<String> sameRowList = new ArrayList<String>();
        for(String word : words) {
           if(findWordInSameRow(word)) {
               sameRowList.add(word);
               System.out.println(word);
           }
        }
        String[] samwWords = new String[sameRowList.size()];
        samwWords = sameRowList.toArray(samwWords);
        return samwWords;
    }

    public static boolean findWordInSameRow(String word) {
        String keyBoard = "qwertyuiopasdfghjkl&zxcvbnm&&&";
        char[] charWord = word.toLowerCase().toCharArray();
        int row = keyBoard.indexOf(charWord[0]) / 10;
        for(char c : charWord) {
            if(row != keyBoard.indexOf(c) / 10) {
                return false; 
            }
        }
        return true;
    }
}