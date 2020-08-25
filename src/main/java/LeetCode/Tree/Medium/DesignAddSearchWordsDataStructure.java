package LeetCode.Tree.Medium;

public class DesignAddSearchWordsDataStructure {

    private TrieNode root;

    /** Initialize your data structure here. */
    public DesignAddSearchWordsDataStructure() {
        root = new TrieNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            Character character = word.charAt(i);
            if (!node.isChildren(character)) {
                node.putChildren(character, new TrieNode());
            }
            node = node.getChild(character);
        }
        node.setWord(true);
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return searchHelp(word, 0, root);
    }

    private boolean searchHelp(String word, int pos, TrieNode node) {
        if (pos == word.length()) {
            return node.isWord;
        }

        Character character = word.charAt(pos);

        if (character.equals('.')) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (node.isChildren(ch) && searchHelp(word, pos + 1, node.getChild(ch))) {
                    return true;
                }
            }
            return false;
        }

        if (!node.isChildren(character)) {
            return false;
        } else {
            return searchHelp(word, pos + 1, node.getChild(character));
        }
    }

    class TrieNode {
        private boolean isWord;
        private TrieNode[] children;

        public TrieNode() {
            children = new TrieNode[26];
            isWord = false;
        }

        boolean isChildren(Character character) {
            return children[character - 'a'] != null;
        }

        void putChildren(Character character, TrieNode trieNode) {
            children[character - 'a'] = trieNode;
        }

        TrieNode getChild(Character character) {
            return children[character - 'a'];
        }

        public void setWord(boolean word) {
            isWord = word;
        }

        public boolean isWord() {
            return isWord;
        }
    }
}
