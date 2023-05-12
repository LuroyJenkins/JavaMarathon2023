package day18;

public class Node {
    private final int value;
    private Node leftSon;
    private Node rightSon;

    public Node(int value) {
        this.value = value;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public static void addNode(Node node, Node root) {
        if (node.getValue() >= root.getValue()) {
            if (root.getRightSon() == null)
                root.setRightSon(node);
            else addNode(node, root.getRightSon());
        }
        if(node.getValue() < root.getValue()) {
            if (root.getLeftSon() == null)
                root.setLeftSon(node);
            else addNode(node, root.getLeftSon());
        }
    }
}
