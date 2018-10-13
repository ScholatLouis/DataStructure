import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class solution_496 {
    public static void main(String[] args) {
        solution_496 solution = new solution_496();
        int[] nums1 = new int[]{2,4};
        int[] nums2 = new int[]{1,2,3,4};
        solution.nextGreaterNumber2(nums1, nums2);
    }

    public int[] nextGreaterNumber(int[] nums1, int[] nums2) {
        int[] nextGreateArr = new int[nums1.length];
        for(int i = 0; i <nums1.length; ++i) {
            int inNums2Index = nums2.length;
            for(int j = 0; j < nums2.length; ++j) {
                if(nums1[i] == nums2[j])
                    inNums2Index = j;
                if(j > inNums2Index && nums2[j] > nums1[i] && nextGreateArr[i] == 0) {
                    nextGreateArr[i] = nums2[j];
                }
            }
            if(nextGreateArr[i] == 0) {
                nextGreateArr[i] = -1;
            }
        }
        for(int item : nextGreateArr) {
            System.out.print(item + " ");
        }
        System.out.println();
        return nextGreateArr;
    }

    public int[] nextGreaterNumber2(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums2.length; ++i) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        for(int i = 0; i < nums1.length; ++i) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
            System.out.print(nums1[i] + " ");
        }
        return nums1;
    }
}