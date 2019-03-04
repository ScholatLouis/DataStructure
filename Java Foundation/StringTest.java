public class StringTest {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.stringEquals();
    }

    public void stringEquals() {
        String[] str1 = new String[]{"hello world"};
        String[] str2 = new String[]{"hellow world"};
        System.out.println(str1 == str2);

        String str3 = "hello world";
        String str4 = "hello world";
        System.out.println(str3 == str4);
    }
}