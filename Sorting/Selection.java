import org.omg.CORBA.UNSUPPORTED_POLICY;

/**
 * key point: 不断选择剩余元素中的最小者
 * 
 * 特点：
 *  1)比较次数：N * N -1 * N -2 * ... * 1 
 *  2)交换次数：N
 *  3)数据移动最少
 *  4)运行时间于输入无关
 */

 public class Selection {
    public static void main(String[] args) {
        System.out.println("LouisZeng");
        int selctoin[] = new int[]{6, 5, 3, 1, 8, 7, 2, 4, 12};
        System.out.println("Selection Sorted");
        selectionSort(selctoin);
        for(int item : selctoin) {
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] unsorted) {
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
    }
 }