import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class solution_884 {
    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        String[] words = uncommonFromSentence(A, B);
        for(String item : words) {
            System.out.println(item);
        }
    }

    public static String[] uncommonFromSentence(String A, String B) {
        String mix = A + " " + B;
        String[] sentence = mix.split(" ");
        HashMap<String, Integer> sentenceMap = new HashMap<String, Integer>();
        for(String word : sentence) {
            sentenceMap.put(word, sentenceMap.getOrDefault(word, 0) + 1);
        }
        List<String> sentenceList = new ArrayList<String>();
        for(Map.Entry<String,Integer> item : sentenceMap.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
            if(item.getValue() == 1)
                sentenceList.add(item.getKey());
        }
        return sentenceList.toArray(new String[0]);
    }
}