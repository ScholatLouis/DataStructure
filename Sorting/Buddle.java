import java.util.Arrays;

public class Buddle {
    public static void main(String[] args) {
        System.out.println("LouisZeng");
        int buddle[] = new int[]{6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("buddle sorted");
        buddleSort(buddle);
        for(int item : buddle) {
            System.out.print(item);
        }
        System.out.println();
        bubbleSort();
    }

    /**
     * key point: 相邻比较 大的往下沉
     */
    public static void buddleSort(int[] unsort) {
        for(int i = 0; i < unsort.length; ++i) {
            // 两个遍历方式都一样 实质重要的是数据大的往下沉
            // 第二个方式会好些 比较的次数相对少
            // for(int j = 1; j < unsort.length - 1; ++j) {
            for(int j = i + 1; j < unsort.length; ++j) {
                if(unsort[i] > unsort[j]) {
                    int temp = unsort[i];
                    unsort[i] = unsort[j];
                    unsort[j] = temp;
                }
            }
        }
    }

    // 每趟只排序好一个数，因此需要n趟
    // 每一趟需要对比的数量为n-i
    // 大数下沉
    public static void buddleSort2(int[] arr) {
        for(int i = 0; i < arr.length - 1; ++i) {
            for(int j = 1; j < arr.length - i; ++j) {
                if(arr[j-1] > arr[j]) {
                    // 交换前后两个数
                }
            }
        }
    }

    // 冒泡排序 n趟 大的往后走 前后两个比较
    public static void bubbleSort() {
        int[] arr = new int[]{4, 2, 5, 1, 0};
        if(arr == null || arr.length == 0) 
            return ;
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 1; j < arr.length - i; ++j) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}