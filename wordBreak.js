// Given a string s and a dictionary of words dict,
// add spaces in s to construct a sentence
// where each word is a valid dictionary word.
// Return all such possible sentences.
// 
// For example, given
// 
// s = "catsanddog",
// dict = ["cat", "cats", "and", "sand", "dog"].
// 
// A solution is ["cats and dog", "cat sand dog"].

function wordBreak(s, dict) {
    // TODO: implementation
}


class Trie {
    
    private class Node {
        Node[] childs = new Node[26];
        boolean isLeaf = false;
        boolean isMissed = false;
        Node() {};
        Node(int index, char c) {
            this.childs[index] = c;
        };
    }
    
    // 表示字典树
    private Node trie = new Node();
    
    // 将字典插入字典树
    public void insert(String word, Node trie) {
        if(word == null || word.length() == 0)
            return ;
        int index = word.charAt(0) - 'a';
        if(trie.childs[index] == null) {
            trie.childs[index] = new Node(index, word.charAt(0));
        }
        if(word.length == 1)
            trie.childs[index].isLeaf = true;
        else 
            insert(word.substring(1), trie.childs[index]);
    }
    
    // 是否搜索到对应的单词
    public boolean search(String word, Node trie) {
        if(trie == null)
            return false;
        
        int index = word.charAt(0) - 'a';
        if(trie.childs[index] == null) 
            return false;
        else if(word.length == 1 && trie.isLeaf && !trie.isMissed)
            return true;
        return search(word.substring(1), trie);
    }
    
    // 返回查询到的所有字符串数组
    public String[] getSolution(String[] dict, String[] words) {
        // 将字典插入到字典树
        List<String> solution = new List<String>();
        if(dict == null || dict.length == 0)
            return solution;
           
        if(words == null || words.length == 0)
            return solution;
           
        for(int i = 0; i < dict.length; ++i) {
            insert(dict[i], trie);
        }
        
        //  
        for(int i = 0; i < words.length; ++i) {
            if(search(words[i], trie)) {
                solution.add(words[i]);
            }
        }
        
        return solution;
    }

}















