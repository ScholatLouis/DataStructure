public class solution_67 {
    public static void main(String[] args) {}

    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0)
            return b;
        if(b == null || b.length() == 0)
            return a;
        int apos = a.length() - 1;
        int bpos = b.length() - 1;
        int acurrent = 0;
        int bcurrent = 0;
        int carray = 0;
        StringBuffer sum = new StringBuffer();
        while(apos >= 0 && bpos >= 0) {
            acurrent = a.charAt(apos) - '0';
            bcurrent = b.charAt(bpos) - '0';
            sum.append(String.valueOf(acurrent + bcurrent + carray) % 2);
            carray = (acurrent + bcurrent + carray) / 2;
            --apos;
            --bpos;
        }
        while(apos >= 0) {
            acurrent = a.charAt(apos) - '0';
            sum.append(String.valueOf(acurrent + carray) % 2);
            carray = (acurrent + carray) / 2;
            --apos;
        }
        while(bpos >= 0) {
            bcurrent = b.charAt(bpos) - '0';
            sum.append(String.valueOf(bcurrent + carray) % 2);
            carray = (bcurrent + carray) / 2;
            --bpos;
        }
        if(carray == 1) {
            sum.append("1");
        }
        return sum.reverse().toString();
    }
}