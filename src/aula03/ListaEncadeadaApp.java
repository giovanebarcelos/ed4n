package aula03;

/*
1. Implementar uma Lista Encadeada Simples
📌 Enunciado: Implemente uma lista encadeada simples em Java
com as operações básicas: inserção no final,
remoção e exibição dos elementos.
 */

public class ListaEncadeadaApp {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserir(13);
        lista.inserir(73);
        lista.inserir(8);

        lista.mostrar();

        lista.remover(73);

        System.out.println("Depois da remoção do 73");

        lista.mostrar();

        lista.inserir(new int[]{9, 83, 5});
        System.out.println("Depois da inserção de 9,83,5");

        lista.mostrar();

        lista.reverter();

        System.out.println("Depois da reversão");

        lista.mostrar();

        lista.reverter1();

        System.out.println("Depois da reversão 1");

        lista.mostrar();

    }
}
