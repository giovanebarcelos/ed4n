package aula05;

public class AVLTreeApp {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert(new int[]{13,8,73,4,6,9});
        System.out.println("Árvore Inicial: ");
        tree.printTree();
        //System.out.printf("Valor: %d", tree.search(73));

        System.out.println("Árvore após alteração de 9 para 19");
        //tree.update(9,19);
        tree.printTree();

        System.out.println("Árvore após remoção do valor 4");
        //tree.delete(4);
        tree.printTree();
    }
}
