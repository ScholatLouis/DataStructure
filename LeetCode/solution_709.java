public class solution_709 {
    public static void main(String[] args) {
        String str = "al&phaBET";
        toLowerCase(str);
    }

    public static String toLowerCase(String str) {
        char[] lowerCase = new char[str.length()];
        for(int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'A') {
                lowerCase[i] = (char)(str.charAt(i) - 'A' + 'a');
            }
        }
        return new String(lowerCase);
    }

    // imporvement
    public static String toLowerCase2(String str) {
        char[] lowerCase = str.toCharArray();
        for(int i = 0; i < str.length(); ++i) {
            if(lowerCase[i] > 'A' && lowerCase[i] < 'Z') {
                lowerCase[i] = (char)(lowerCase[i] + 32);
            }
        }
        return new String(lowerCase);
    }
}