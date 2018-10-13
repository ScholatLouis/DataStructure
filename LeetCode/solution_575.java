import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class solution_575 {
    public static void main(String[] args) {
        solution_575 solution = new solution_575();
        int[] candies = new int[]{100000,0,100000,0,100000,0,100000,0,100000,0,100000,0};
        solution.distributeCandies3(candies);
    }

    public int distributeCandies(int[] candies) {
        int even = candies.length / 2;
        List<Integer> candyCategory = new ArrayList<Integer>();
        for(int item : candies) {
            if(candyCategory.size() > even)
                break;
            if(!candyCategory.contains(item)) {
                candyCategory.add(item);
            }
        }
        System.out.println(candyCategory.size() > even ? even : candyCategory.size());
        return candyCategory.size() > even ? even : candyCategory.size();
    }

    public int distributeCandies2(int[] candies) {
        int even = candies.length / 2;
        int category = 1;
        Arrays.sort(candies);
        int preKind = candies[0];
        for(int item : candies) {
            if(category >= even)
                break;
            if(item != preKind) {
                ++category;
                preKind = item;
            }
        }
        System.out.println(category);
        return category > even ? even : category;
    }

    public int distributeCandies3(int[] candies) {
        Set<Integer> category = new HashSet<Integer>();
        for(int item : candies) {
            category.add(item);
        }
        return Math.min(category.size(), candies.length / 2);
    }
}