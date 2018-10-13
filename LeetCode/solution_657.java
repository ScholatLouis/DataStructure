public class solution_657 {
    public static void main(String[] args) {
        String moves = "RRDD";
        judgeCircle(moves);
    }

    public static boolean judgeCircle(String moves) {
        int xAxis = 0;
        int yAxis = 0;
        for(char item : moves.toCharArray()) {
            switch(item) {
                case 'U':
                    ++yAxis;
                    break;
                case 'D':
                    --yAxis;
                    break;
                case 'L':
                    --xAxis;
                    break;
                case 'R':
                    ++xAxis;
                    break;
                default:
                    break;
            }
        }
        System.out.println(xAxis + " : " + yAxis);
        System.out.println(xAxis == 0 && yAxis == 0);
        return xAxis == 0 && yAxis == 0;
    }

    // wrong answer RRDD
    public static boolean judgeCircle2(String moves) {
        int count = 0;
        for(char item : moves.toCharArray()) {
            switch (item) {
                case 'U':
                case 'R':
                    ++count;
                    break;
                case 'D':
                case 'L':
                    --count;
                    break;
                default:
                    break;
            }
        }
        System.out.println(count == 0);
        return count == 0;
    }
}