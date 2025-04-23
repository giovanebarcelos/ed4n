package simulado01;

/*
  1 ponto
  Implemente FilaInteiros usando array circular com:
  - enfileirar(int), desenfileirar(), estaVazia(), tamanho()
*/

public class FilaInteiros {
    private int[] dados;
    private int inicio = 0, fim = -1, tamanho = 0;

    public FilaInteiros(int capacidade) {
        dados = new int[capacidade];
    }

    public void enfileirar(int valor) {
        fim = (fim + 1) % dados.length;
        dados[fim] = valor;
        this.tamanho++;
    }

    public int desenfileirar() {
        int valor = dados[inicio];
        inicio = (inicio + 1) % dados.length;
        this.tamanho--;
        return valor;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }
}
