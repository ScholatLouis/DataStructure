public class solution_341 {
    public static void main(String[] args) {}

    private Queue<Integer> queue = new ArrayDeque<Integer>();
    public NestedIterator(List<NestedInteger> nestedList) {
        if(nestedList == null || nestedList.size() == 0)
            return ;
        for(int i = 0; i < nestedList.size(); ++i) {
            NestedInteger nested = nestedList.get(i);
            if(nested.isInteger()) {
                queue.add(nested.getInteger());
            } else {
                iteratorNested(nested);
            }
        }
    }

    public void iteratorNested(NestedInteger nestedInteger) {
        if(nestedInteger == null)
            return ;
        List<NestedInteger> list = nestedInteger.getList();
        for(int i = 0; i < list.size(); ++i) {
            NestedInteger nested = list.get(i);
            if(nested.isInteger())
                queue.add(nested.getInteger());
            else 
                iteratorNested(nested);
        }
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public Integer next() {
        if(!queue.isEmpty()))
            return queue.poll();
        else 
            return -1;
    }
}