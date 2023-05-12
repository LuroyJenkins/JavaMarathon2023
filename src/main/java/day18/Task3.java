package day18;

import static day18.Node.addNode;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] treeValues = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};

        for (int value: treeValues){
            addNode(new Node(value), root);
        }

        dfs(root);
    }

    public static void dfs(Node root){
        if (root == null)
            return;

        dfs(root.getLeftSon());
        System.out.print(root.getValue() + " ");
        dfs(root.getRightSon());
    }
}