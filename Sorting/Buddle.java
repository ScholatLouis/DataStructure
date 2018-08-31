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
}