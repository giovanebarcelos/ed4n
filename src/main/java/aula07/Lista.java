package aula07;

import java.util.ArrayList;

public class Lista {

    private No inicio;
    private int tamanho = 0;

    public Lista(){
        this.inicio = null;
    }

    public void imprimir(String titulo) {
        System.out.printf("\n%s\nNúmeros: ", titulo);

        int[] numeros = this.getNumeros();

        for (int numero: numeros){
            System.out.printf("%d ", numero);
        }
    }

    private int[] getNumeros() {
        No temp = this.inicio;
        int[] numeros = new int[this.tamanho];

        int posicao = 0;
        while (temp != null){
            numeros[posicao++] = temp.numero;
            temp = temp.proximo;
        }

        return numeros;
    }

    public void inserir(int[] numeros) {
        for (int numero: numeros){
            this.inserir(numero);
        }
    }

    private void inserir(int numero) {
        No novoNo = new No(numero);
        this.tamanho++;

        if (this.inicio == null){
            this.inicio = novoNo;
            return;
        }

        No temp = this.inicio;
        while (temp.proximo != null) {
            temp = temp.proximo;
        }

        temp.proximo = novoNo;
    }

    public void remover(int numero) {
        if (this.inicio != null && this.inicio.numero == numero){
            this.inicio = this.inicio.proximo;
        }

        No temp = this.inicio, anterior = null;
        while (temp != null && temp.numero != numero){
            anterior = temp;
            temp = temp.proximo;
        }

        this.tamanho--;
        if (temp == null) return;
        anterior.proximo = temp.proximo;
    }
}
