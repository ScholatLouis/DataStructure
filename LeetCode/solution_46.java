import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class solution_46 {

    private List<List<Integer>> list = new ArrayList<List<Integer>>();

    public static void main(String[] args) {
        solution_46 solution = new solution_46();
        int[] array = new int[]{1, 2, 3, 4};
        solution.fullArray(array, 0, array.length - 1);
    }

    public List<List<Integer>> premutation(int[] nums) {
        fullArray(nums, 0, nums.length - 1);
        return list;
    }

    public void fullArray(int[] array, int cursor, int end) {
        if(cursor == end) {
            List<Integer> subList = new ArrayList<Integer>();
            for(int num : array) {
                subList.add(num);
            }
            list.add(subList);
        } else {
            for(int i = cursor; i <= end; ++i) {
                swap(array, cursor, i);
                fullArray(array, cursor+1, end);
                swap(array, cursor, i);
            }
        }
    }

    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}