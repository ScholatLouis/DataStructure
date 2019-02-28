import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 5, 7, 6};
        heapSortMin(arr);
        arr = new int[]{7, 6, 5, 3, 2, 1, 9};
        shitUp(arr, 6, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // n个节点 非叶子结点的序号为0 - (n/2-1)
    public static void heapSort(int[] arr) {
        for(int i = arr.length/2 - 1; i >= 0; --i) {
            adjustHeap(arr, i, arr.length);
        }
        for(int i = arr.length - 1; i > 0; --i) {
            swap(arr, 0, i);
            adjustHeap(arr, 0, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void adjustHeap(int[] arr, int target, int length) {
        int num = arr[target];
        for(int i = target * 2 + 1; i < length; i = i * 2 + 1) {
            if(i+1 < length && arr[i] < arr[i+1])
                ++i;
            if(arr[i] > num) {
                arr[target] = arr[i];
                target = i;
            } else {
                break;
            }
            arr[target] = num;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    public static void heapSortMin(int[] arr) {
        for(int i = arr.length/2 - 1; i >= 0; --i) {
            adjustMinHeap(arr, i, arr.length);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        for(int i = arr.length - 1; i > 0; --i) {
            swap(arr, 0, i);
            adjustMinHeap(arr, 0, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void adjustMinHeap(int[] arr, int target, int length) {
        int number = arr[target];
        for(int i = target * 2 + 1; i <length; i = i * 2 + 1) {
            if(i+1 < length && arr[i] > arr[i+1])
                ++i;
            if(number > arr[i]) {
                arr[target] = arr[i];
                target = i;
            } else {
                break;
            }
            arr[target] = number;
        }
    }

    // 通过数组创建大顶堆 || 小顶堆
    // 对所有的非叶子节点进行调整
    // for i = arr.length/2-1; i >= 0; --i
    // adjustHeap(arr, i, arr.length)
    public static void adjustHeap1(int[] arr, int target, int length) {
        int num = arr[target];
        for(int i = 2*target+1; i < length; i = 2*i+1) {
            // 如果创建小顶堆 则当arr[i]>arr[i+1]的时候，将i移动到后一个
            if(i+1 < length && arr[i] > arr[i+1])
                ++i;
            if(num > arr[i]) {
                arr[target] = arr[i];
                target = i;
            } else {
                break;
            }
        }
        arr[target] = num;
    }

    public static void shitUp(int[] arr, int target, int length) {
        if(target >= length) 
            return;
        int num = arr[target];
        for(int i = target/2-1; i >= 0; i = i/2-1) {
            // BIG HEAP
            if(num > arr[i]) {
                arr[target] = arr[i];
                target = i;
            } else {
                break;
            }
        }
        arr[target] = num;
    }
}