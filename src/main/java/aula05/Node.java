package aula05;

public class Node {
    int value, height;
    Node left, right;

    public Node(int value){
        this.value = value;
        this.height = 1;
        left = right = null;
    }

}
