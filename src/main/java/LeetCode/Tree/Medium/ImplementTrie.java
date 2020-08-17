package LeetCode.Tree.Medium;

public class ImplementTrie {
    private TrieNode root;

    public ImplementTrie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (!node.isChildExist(character)) {
                node.put(character, new TrieNode());
            }
            node = node.get(character);
        }

        node.setEnd();
    }

    public boolean search(String word) {
        TrieNode trieNode = searchPrefix(word);

        return trieNode != null && trieNode.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode trieNode = searchPrefix(prefix);

        return trieNode != null;
    }

    private TrieNode searchPrefix(String word) {
        TrieNode node = root;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (node.isChildExist(character)) {
                node = node.get(character);
            } else {
                return null;
            }
        }

        return node;
    }
}

class TrieNode {
    private static final int R = 26;

    private TrieNode[] children;
    private boolean isEnd;

    public TrieNode() {
        children = new TrieNode[R];
        isEnd = false;
    }

    boolean isChildExist(char character) {
        return children[character - 'a'] != null;
    }

    TrieNode get(char character) {
        return children[character - 'a'];
    }

    void put(char character, TrieNode trieNode) {
        children[character - 'a'] = trieNode;
    }

    void setEnd() {
        isEnd = true;
    }

    boolean isEnd() {
        return isEnd;
    }
}
