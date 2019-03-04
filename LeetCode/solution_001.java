import java.util.Map;
import java.util.HashMap;

public class solution_001 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        towSum(arr, 9);
    }

    public static int[] towSum(int[] arr, int target) {
        int[] index = new int[2];
        if(arr == null || arr.length == 0) {
            return index;
        }
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; ++i) {
            if(indexMap.containsKey(arr[i])) {
                index[0] = indexMap.get(arr[i]);
                index[1] = i;
            } else {
                indexMap.put(target - arr[i], i);
            }
        }
        System.out.println(index[0] + " " + index[1]);
        return index;
    }
}