public class QuickSort{
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 5, 6, 7};
        quickSort(arr);
    }

    public static void quickSort(int[] arr) {
        int[] sorted = qSort(arr, 0, arr.length - 1);
        for(int number : sorted) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[] qSort(int[] arr, int low, int high) {
        if(low < high) {
            int base = partiction(arr, low, high);
            qSort(arr, low, base - 1);
            qSort(arr, base + 1, high);
        }
        return arr;
    }

    public static int partiction(int[] arr, int low, int high) {
        int pivot = arr[low];
        while(low < high) {
            while(low < high && arr[high] >= pivot) --high;
            arr[low] = arr[high];
            while(low < high && arr[low] <= pivot) ++low;
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }
}