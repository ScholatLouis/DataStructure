public class solution_540 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2};
        singleNoneDuplicate4(arr);
    }

    public static int singleNoneDuplicate(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }

        int xorResult = 0;
        for(int i = 0; i < arr.length; ++i) {
            xorResult = xorResult ^ arr[i];
        }

        System.out.println(xorResult);
        return xorResult;
    }

    public static int singleNoneDuplicate2(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }

        for(int i = 0; i <= arr.length - 1; ++i) {
            if(i == 0 && arr[i] != arr[i+1]) {
                System.out.println(arr[i]);
                return arr[0];
            } else if(i == arr.length - 1 && arr[i-1] != arr[i]) {
                System.out.println(arr[i]);
                return arr[i];
            } else if((i > 0) && (i < arr.length - 1) && (arr[i-1] != arr[i]) && (arr[i] != arr[i+1])) {
                System.out.println(arr[i]);
                return arr[i];
            }
        }

        return 0;
    }

    public static int singleNoneDuplicate3(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }

        int low = 0;
        int high = arr.length - 1;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(mid % 2 != 0) 
                mid = mid - 1;
            if(arr[mid] != arr[mid+1])
                high = mid - 1;
            else 
                low = mid + 2;
        }
        System.out.println(low + " " + high);
        return arr[low];
    }

    public static int singleNoneDuplicate4(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }

        for(int i = 0; i < arr.length - 1; i = i + 2) {
            if(arr[i] != arr[i+1]) {
                System.out.println(arr[i]);
                return arr[i];
            }
        }
        System.out.println(arr[arr.length - 1]);
        return arr[arr.length-1];
    }
}