package simulado01;
/*
  2 pontos
  Implemente ArvoreBinaria com:
  - inserir(int), buscar(int), contarNos()
 */

public class ArvoreBinaria {
    class No {
        int valor;
        No esquerda, direita;
    }

    private No raiz;
    private int contador = 0;

    public void inserir(int valor) {
        this.raiz = inserir(raiz, valor);
    }

    private No inserir(No no, int valor) {
        if (no == null){
            contador++;
            No novoNo = new No();
            novoNo.valor = valor;
            return novoNo;
        }

        if (valor == no.valor){
            return no;
        } else if ( valor < no.valor) {
            no.esquerda = inserir(no.esquerda, valor);
        } else {
            no.direita = inserir(no.direita, valor);
        }

        return no;
    }

    public boolean buscar(int valor) {
        return this.buscar(this.raiz, valor);
    }

    private boolean buscar(No no, int valor) {
        if (no == null){
            return false;
        }

        if (valor == no.valor){
            return true;
        }

        return valor < no.valor?
                buscar(no.esquerda, valor) :
                buscar(no.direita, valor);
    }

    public int contarNos() {
        return this.contador;
    }
}
