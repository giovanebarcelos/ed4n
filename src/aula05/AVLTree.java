package aula05;

import static java.lang.Long.rotateLeft;
import static java.lang.Long.rotateRight;

public class AVLTree {
    Node root = null;

    public void insert(int[] values) {
        for (int value: values){
            this.root = this.insert(this.root, value);
        }
    }

    public Node insert(Node node, int value){
        if (node == null) return new Node(value);

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value){
            node.right = insert(node.right, value);
        } else return node;

        node.height = 1 + Math.max(this.heigth(node.left),
                this.heigth(node.right));
        int balance = this.getBalance(node);

        if (balance > 1 && value < node.left.value){
            return rotateRight(node);
        }
        if (balance < -1 && value > node.right.value){
            return rotateLeft(node);
        }
        if (balance > 1 && value > node.left.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1 && value < node.right.value){
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node temp = y.left;

        y.left = x;
        x.right = temp;

        x.height = Math.max(heigth(x.left), heigth(x.right)) + 1;
        y.height = Math.max(heigth(y.left), heigth(y.right)) + 1;

        return y;
    }

    private Node rotateRight(Node y) {
        Node x = y.left;
        Node temp = x.right;

        x.right = y;
        y.left = temp;

        x.height = Math.max(heigth(x.left), heigth(x.right)) + 1;
        y.height = Math.max(heigth(y.left), heigth(y.right)) + 1;

        return x;
    }

    private int getBalance(Node node) {
        return (node == null) ? 0 :
                heigth(node.left) - heigth(node.right);
    }

    private int heigth(Node node) {
        return (node == null) ? 0: node.height;
    }

    public void printTree() {
        inOrderTraversal(this.root);
        System.out.println();
    }

    private void inOrderTraversal(Node root) {
        if (root != null){
            this.inOrderTraversal(root.left);
            System.out.println(root.value + " ") ;
            this.inOrderTraversal(root.right);
        }
    }
}
