import java.util.List;
import java.util.ArrayList;

public class solution_728 {
    public static void main(String[] args) {
        selfDividingNumbers2(1, 22);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNums = new ArrayList<Integer>();
        for(int i = left; i <= right; ++i) {
            int digits = i;
            boolean flag = true;
            while(digits != 0) {
                System.out.print(digits / 10);
                if(digits%10 == 0 || i % (digits % 10) != 0) {
                    flag = false;
                    break;
                } 
                digits /=  10;
            }
            if(flag) {
                selfDividingNums.add(i);
            }
        }
        for(Integer item : selfDividingNums) {
            System.out.print(item + " ");
        }
        return selfDividingNums;
    }

    // 对比 认识拆分函数的作用
    public static List<Integer> selfDividingNumbers2(int left, int right) {
        List<Integer> selfDividingNums = new ArrayList<Integer>();
        for(int i = left; i <= right; ++i) {
            if(selfDividing(i)) {
                selfDividingNums.add(i);
            }
        }
        for(Integer item : selfDividingNums) {
            System.out.print(item + " ");
        }
        System.out.println();
        return selfDividingNums;
    }

    public static boolean selfDividing(int num) {
        int digits = num;
        while(digits != 0) {
            if(digits%10 == 0 || num % (digits % 10) != 0) {
                return false;
            }
            digits /= 10;
        }
        return true;
    }
}