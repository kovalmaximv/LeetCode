package LeetCode.Tree.Hard;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/word-search-ii/
// Hard
// Problem: 2

public class WordSearchII {
    List<String> result = new LinkedList<>();
    char[][] boardWords;

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        boardWords = board;
        for(String word: words) {
            TrieNode.insert(root, word);
        }



        for (int i = 0; i < boardWords.length; i++) {
            for (int j = 0; j < boardWords[i].length; j++) {
                if (root.isChildExist(boardWords[i][j])) {
                    dfs(root, i, j);
                }
            }
        }

        return result;
    }

    private void dfs(TrieNode node, int i, int j) {
        char c = boardWords[i][j];
        if (c == '#' || !node.isChildExist(c)) return;

        node = node.get(c);
        if (node.getWord() != null) {
            result.add(node.getWord());
            node.setWord(null);
        }

        boardWords[i][j] = '#';
        if (i > 0) dfs(node, i - 1, j);
        if (j > 0) dfs(node, i, j - 1);
        if (i < boardWords.length - 1) dfs(node, i + 1, j);
        if (j < boardWords[i].length - 1) dfs(node, i, j + 1);
        boardWords[i][j] = c;
    }
}

class TrieNode {
    private TrieNode[] children;
    private String word;

    public TrieNode() {
        children = new TrieNode[26];
        word = null;
    }

    public static void insert(TrieNode root,String word) {
        TrieNode node = root;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (!node.isChildExist(character)) {
                node.put(character, new TrieNode());
            }
            node = node.get(character);
        }

        node.setWord(word);
    }

    public boolean isChildExist(char character) {
        return children[character - 'a'] != null;
    }

    public TrieNode get(char character) {
        return children[character - 'a'];
    }

    public void put(char character, TrieNode trieNode) {
        children[character - 'a'] = trieNode;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}