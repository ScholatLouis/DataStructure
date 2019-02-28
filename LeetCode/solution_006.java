import java.util.List;
import java.util.ArrayList;

public class solution_006 {
    public static void main(String[] args) {
        String s = "AB";
        int rows = 1;
        System.out.println(convert(s, rows));
    }

    public static String convert(String s, int rows) {
        if(s == null || s.length() == 0) 
            return "";
        if(rows == 1)
            return s;

        int currentRow = 0;
        boolean goingdown = false;
        List<StringBuffer> list = new ArrayList<StringBuffer>();

        for(int i = 0; i < Math.min(rows, s.length()); ++i)
            list.add(new StringBuffer());

        for(char c : s.toCharArray()) {
            list.get(currentRow).append(c);
            if(currentRow == 0 || currentRow == rows - 1)
                goingdown = !goingdown;
            currentRow += goingdown ? 1 : -1;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(StringBuffer sb : list)
            stringBuffer.append(sb); 
        return stringBuffer.toString();
    }
}