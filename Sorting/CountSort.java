import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        CountSort countSort = new CountSort();
        int[] arr = new int[]{4, 2, 4, 7, 8, 3, 5};
        countSort.countSort(arr);
    }

    // 计数排序
    // 1. 第一次遍历找出最大值和最小值
    // 2. 开辟一块新的空间创建新的数组B 长度为(max - min + 1)
    // 3. 数组B中index的元素记录的是数组A中某元素出现的次数
    // 4. 最后按序输出整个数组
    public void countSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : arr) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        int[] countArr = new int[max - min + 1];
        for(int num : arr) {
            // 把所有的数都减掉了min 也即index=0的时候对应的数值为min
            countArr[num - min]++;
        }
        for(int i = 0; i < countArr.length; ++i) {
            // 输出重复的次数
            for(int j = 0; j < countArr[i]; ++j) {
                // 由于index=0对应的数值是min，因此这里在输出的时候要加上min
                System.out.print((i+min) + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(countArr));
    }
}