package aula04;

public class ArvoreBinaria {
    private Nodo root = null;

    public void incluir(int numero) {
        this.root = incluirNumero(root, numero);
    }

    private Nodo incluirNumero(Nodo root, int numero) {
        if (root == null) return new Nodo(numero);

        if (numero < root.numero) {
            root.esquerda = incluirNumero(root.esquerda, numero);
        } else if (numero > root.numero){
            root.direita = incluirNumero(root.direita, numero);
        }

        return root;
    }

    public void imprimir() {
        imprimirEmOrdem(this.root);
        System.out.println();
    }

    private void imprimirEmOrdem(Nodo root) {
        if (root != null){
            this.imprimirEmOrdem(root.esquerda);
            System.out.print(root.numero+" ");
            this.imprimirEmOrdem(root.direita);
        }
    }

    public void excluir(int numero) {
        this.root = excluir(this.root, numero);
    }

    public Nodo excluir(Nodo root, int numero){
        if (root == null) return root;

        if (numero < root.numero){
            root.esquerda = excluir(root.esquerda, numero);
        } else if (numero > root.numero){
            root.direita = excluir(root.direita, numero);
        } else {
            if (root.esquerda == null) {
                return root.direita;
            } else if (root.direita == null) {
                return root.esquerda;
            }
            root.numero = menorValor(root.direita);
            root.direita = excluir(root.direita, root.numero);
        }

        return root;
    }

    private int menorValor(Nodo root) {
        int min = root.numero;

        while (root.esquerda != null){
            min = root.esquerda.numero;
            root = root.esquerda;
        }
        return min;
    }

    public void alterar(int i, int i1) {
    }

    public int consultar(int i) {
        return 0;
    }
}
