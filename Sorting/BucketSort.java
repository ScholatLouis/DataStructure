import java.util.Arrays;

public class BucketSort {
    public static void main(String[] args) {
        BucketSort bucketSort = new BucketSort();
        int[] arr = new int[]{3, 5, 4, 6, 8, 9, 13, 0, 45};
        bucketSort.bucketSort(arr, 3);
    }

    // 桶排序是计数排序的优化版，没有申请max-min+1的空间，而是申请较少的空间完成排序工作
    // 确定的是每个桶的大小，桶的数量是不确定的 因此桶的数量计算方法为(max - min + 1) / bucketSize + 1;
    // 第一次遍历找出最大值和最小值
    // 将对应的index分配到对应的桶中进行排序（可以是插入排序）
    // 遍历桶中所有的数据 从而得到有序数组
    public void bucketSort(int[] arr, int bucketSize) {
        if(arr.length == 0 || arr == null)
            return;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : arr) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        int bucketNumber = (int)Math.floor((max - min + 1) / bucketSize) + 1;
        int[][] buckets = new int[bucketNumber][0];
        for(int num : arr) {
            int bucketIndex = (int)Math.floor((num - min) / bucketSize);
            buckets[bucketIndex] = insertSort(buckets[bucketIndex], num);
        }
        for(int i = 0; i < bucketNumber; ++i) {
            // System.out.println(i + " " + Arrays.toString(buckets[i]));
            for(int j = 0; j < buckets[i].length; ++j) {
                System.out.print(buckets[i][j] + " ");
            }
        }
        System.out.println();
    }

    public int[] insertSort(int[] arr, int target) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = target;
        int targetIndex = arr.length - 1;
        for(int i = arr.length - 1; i >= 0; --i) {
            if(arr[i] > target) {
                --targetIndex;
                arr[i+1] = arr[i];
            }
        }
        arr[targetIndex] = target;
        return arr;
    }
}