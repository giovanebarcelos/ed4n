package simulado01;

/*
  1,5 pontos
  Implemente ListaSimples com:
  - inserirNoInicio(int), removerDoFinal(), contem(int), tamanho()
 */

public class ListaSimples {
    class No {
        int valor;
        No proximo;
    }

    private No inicio;
    private int tamanho = 0;

    public void inserirNoInicio(int valor) {
        No novoNo = new No();
        novoNo.valor = valor;
        novoNo.proximo = inicio;
        inicio = novoNo;
        this.tamanho++;
    }

    public boolean contem(int valor) {
        No atual = inicio;
        while (atual != null){
            if (atual.valor == valor){
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }
}
