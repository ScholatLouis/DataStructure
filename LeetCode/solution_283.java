public class solution_283 {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,12};
        moveZeros2(arr);
    }

    public static void moveZeros(int[] arr) {
        if(arr == null || arr.length == 0) 
            return ;
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            while(arr[low] != 0) ++low;
            while(arr[high] == 0) --high;
            arr[low] = arr[high];
            arr[high] = 0;
            ++low; 
            --high;
        }
        printArr(arr);
    }

    public static void moveZeros1(int[] arr) {
        if(arr == null || arr.length == 0) 
            return ;
        int noneZero = 0;
        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] != 0)
                arr[noneZero++] = arr[i];
        }
        for(int i = noneZero; i < arr.length; ++i) {
            arr[i] = 0;
        }
        printArr(arr);
    }

    public static void moveZeros2(int[] arr) {
        int[] sorted = new int[arr.length];
        int k = 0;
        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] != 0)
                sorted[k++] = arr[i];
        }
        for(int i = k; i < arr.length; ++i)
            sorted[k] = 0;
        printArr(sorted);
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}