import java.util.ArrayList;
import java.util.List;

public class solution_066 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,9,9,8};
        plusOne2(nums);
    }

    public static int[] plusOne2(int[] digits) {
        int digitsSum = 1;
        for(int i = digits.length - 1; i >= 0; --i) {
            digitsSum += digits[i];
            if(digitsSum >= 10) {
                digits[i] = digitsSum % 10;
                digitsSum /= 10;
            } else {
                digits[i] = digitsSum;
                digitsSum = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        if(digitsSum != 0) {
            newDigits[0] = 1;
            for(int i = 0; i < digits.length; ++i) {
                newDigits[i + 1] = digits[i];
            }
        }
        if(digitsSum != 0) {
            for(int item : newDigits) {
                System.out.print(item);
            }
        } else {
            for(int item : digits) {
                System.out.print(item);
            }
        }
        return digitsSum != 0 ? newDigits : digits;
    }
    
    public static int[] plusOne(int[] digits) {
        // 该方法在数组长度超过int的最大数长度的时候会报错
        int sum = 0, count = 0;
        for(int i = digits.length - 1; i >= 0; --i) {
            sum += digits[i] * Math.pow(10, count);
            ++count;
        }
        sum += 1;
        List<Integer> afterNums = new ArrayList<Integer>();
        count = 0;
        while(sum != 0) {
            afterNums.add(sum%10);
            sum /= 10;
        }
        int length = afterNums.size();
        int[] returnNums = new int[length];
        for(int i = 0; i < afterNums.size(); ++i) {
            returnNums[i] = afterNums.get(length - 1 - i);
            System.out.print(returnNums[i]);
        }
        System.out.println();
        return returnNums;
    }
}