import java.util.Arrays;

public class solution_561 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,3,2,2,5};
        arrayPairSum(nums);
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i = i+2) {
            sum += nums[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static int[] sortArray(int[] unsorted) {
        for(int i = 0; i < unsorted.length; ++i) {
            int minIndex = i;
            for(int j = i; j < unsorted.length; ++j) {
                if(unsorted[j] < unsorted[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the number and position
            int temp = unsorted[i];
            unsorted[i] = unsorted[minIndex];
            unsorted[minIndex] = temp;
        }
        for(int item : unsorted) {
            System.out.print(item + " ");
        }
        return unsorted;
    }

    public static int[] shellsort(int[] arr) {
        int gap = arr.length / 2;
        for (; gap > 0; gap /= 2) {      //不断缩小gap，直到1为止
            for (int j = 0; (j+gap) < arr.length; j++){     //使用当前gap进行组内插入排序
                for(int k = 0; (k+gap)< arr.length; k += gap){
                    if(arr[k] > arr[k+gap]) {
                        int temp = arr[k+gap];      //交换操作
                        arr[k+gap] = arr[k];
                        arr[k] = temp;
                        System.out.println("    Sorting:  " + Arrays.toString(arr));
                    }
                }
            }
        }
        return arr;
    }
}