package aula04;
/*
1. CRUD em uma Árvore Binária de Busca (BST)
📌 Enunciado: Implemente os métodos para inserir, remover,
 alterar e consultar valores em uma árvore binária de busca (BST).
 */

public class ArvoreBinariaApp {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        int[] numeros = { 50, 30, 70, 20, 40, 60, 80};

        for (int numero: numeros){
            arvore.incluir(numero);
        }

        System.out.println("Árvore Original");
        arvore.imprimir();

        arvore.excluir(40);
        System.out.println("Árvore depois da exclusão do número 40");
        arvore.imprimir();

        arvore.alterar(30, 35);
        System.out.println("Árvore depois da alteração do 30 para 35");
        arvore.imprimir();

        int numero = arvore.consultar(60);
        System.out.printf("\nNúmero consultado %d", numero);
    }
}
