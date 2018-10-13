public class solution_821 {
    public static void main(String[] args) {
        solution_821 solution = new solution_821();
        String s = "lovltcodasdf";
        char c = 'e';
        solution.shortestToChar(s, c);
    }

    public int[] shortestToChar(String s, char c) {
        int leftDistance = Integer.MAX_VALUE;
        int rightDistance = s.indexOf(c);
        char[] words = s.toCharArray();
        int[] distance = new int[s.length()];
        for(int i = 0; i < s.length(); ++i) {
            if(i > rightDistance) {
                if(s.indexOf(c, leftDistance + 1) != -1) {
                    leftDistance = rightDistance;
                    rightDistance = s.indexOf(c, leftDistance + 1);
                    // System.out.println(leftDistance + " " + rightDistance);
                }
            }
            distance[i] = Math.min(Math.abs(i - leftDistance), Math.abs(i - rightDistance));
            System.out.print(distance[i] + " ");
        }
        System.out.println();
        return distance;
    }
}