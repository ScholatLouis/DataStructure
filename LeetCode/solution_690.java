public class solution_690 {
    public static void main(String[] args) {}

    public int getImportance(List<Employee> employees, int id) {
        if(employees == null || employees.size() == 0)
            return -1;
        int importance = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < employees.size(); ++i) {
            map.put(employees.get(i).id, i);
        }
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(id);
        while(!queue.isEmpty()) {
            int employeeId = queue.poll();
            Employee employee = employees.get(map.get(employeeId));
            importance += employee.importance;
            List<Integer> subordinates = employee.subordinates;
            for(Integer subordinate : subordinates) {
                queue.add(subordinate);
            }
        }
        return importance;
    }
}