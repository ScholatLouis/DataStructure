public class Aria {
    public class TreeNode {
        public Integer id;
        public String path;
        public Integer parentId;
    }

    // input:
    // [{id: 10126,name: "根目录",parentId: -1,path: "0"},
    // {id: 10127,name: "子节点1.1",parentId: 10126,path: "0"},
    // {id: 10128,name: "子节点1.2",parentId:10126,path: "0"},
    // {id: 10129,name: "子节点2.1",parentId:10128,path: "0"}]
    public List<TreeNode> dealAria(List<Catelog> catelogs) {
        if(catelogs == null || catelogs.siz() == 0)
            return null;
        
        // id & index
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < catelogs.size(); ++i) {
            map.put(catelogs.get(i).getId(), i);
        }

        List<TreeNode> list = new ArrayList<TreeNode>();
        Queue<Integer> pathQueue = new ArrayQueue<Integer>();
        for(int i = 0; i < catelogs.size(); ++i) {
            String path = "";
            TreeNode treeNode = new TreeNode();
            treeNode.setId(catelogs.get(i).getId());
            treeNode.setParentId(catelogs.get(i).getParentId());
            pathQueue.add(catelogs.get(i).getId());
            while(!pathQueue.isEmpty()) {
                Integer id = pathQueue.poll();
                Catelog catelog = catelogs.get(map.get(id));
                path += id + " ";
                if(catelog.getParentId() != -1) {
                    pathQueue.add(catelog.getParentId());
                }
            }
            path += " -1";
            treeNode.setPath(path);
            list.add(treeNode);
        }
        return list;
    }
}