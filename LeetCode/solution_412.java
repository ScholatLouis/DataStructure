import java.util.List;
import java.util.ArrayList;

public class solution_412 {
    public static void main(String[] args) {

    }

    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzzList = new ArrayList<String>();
        for(int item = 1; item <= n; ++item) {
            if(item % 3 == 0 && item % 5 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if(item % 3 == 0) {
                fizzBuzzList.add("Fizz");
            } else if(item % 5 == 0) {
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(Integer.toString(item));
                // or use
                // fizzBuzzList.add(String.valueOf(item));
            }
        }
        return fizzBuzzList;
    }
}