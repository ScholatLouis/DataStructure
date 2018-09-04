/**
 * 插入排序将需要调整位置的元素抽取出来 然后依次对比找到合适的位置插入
 */

public class Insert {
    public static void main(String[] args) {
        System.out.println("LouisZeng");
        int unsorted[] = new int[]{6, 5, 3, 1, 8, 7, 2, 4, 12};
        insertSort(unsorted);
        for(int item : unsorted) {
            System.out.print(item);
            System.err.print("  ");
        }
        System.out.println();
    }

    public static void insertSort(int[] unsorted) {
        for(int i = 0; i < unsorted.length; ++i) {
            int comparison = unsorted[i];
            int index = i;
            while(index > 0 && unsorted[index - 1] > comparison) {
                unsorted[index] = unsorted[index - 1];
                --index;
            }
            unsorted[index] = comparison;
        }
    }
}