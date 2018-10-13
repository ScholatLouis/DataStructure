public class solution_852 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,2,0,5,4,2,3,4,2,2,8,1,0};
        peakIndexInMountainArray(nums);
        binarySearch(nums);
    }

    public static int peakIndexInMountainArray(int[] nums) {
        int max = -1;
        int index = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] > max) {
                index = i;
                max = nums[i];
            }
        }
        System.out.println(index);
        return index;
    }

    public static int binarySearch(int[] nums) {
        int lower = 0;
        int heigher = nums.length - 1;
        while(lower < heigher) {
            int middle = (lower + heigher) / 2;
            if(nums[middle] < nums[middle + 1]) {
                lower = middle + 1;
            } else {
                heigher = middle;
            }
        }
        System.out.println(lower);
        return lower;
    }
}