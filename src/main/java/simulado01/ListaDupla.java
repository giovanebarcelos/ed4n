package simulado01;

/*
   2 pontos
   Implemente ListaDupla com:
   - inserirOrdenado(int), remover(int), imprimirInverso()
 */

public class ListaDupla {
    class No {
        int valor;
        No anterior, proximo;
    }

    private No inicio, fim;

    public void inserirOrdenado(int valor) {
        No novoNo = new No();
        novoNo.valor = valor;

        if ( this.inicio == null){
            this.inicio = this.fim = novoNo;
        } else if (valor <= inicio.valor){
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null &&
                   atual.proximo.valor < valor){
                atual = atual.proximo;
            }
            novoNo.proximo = atual.proximo;
            novoNo.anterior = atual;
            if (atual.proximo != null) {
                atual.proximo.anterior = novoNo;
            } else {
                fim = novoNo;
            }
            atual.proximo = novoNo;
        }
    }

    public String imprimirInverso() {
        StringBuilder stb = new StringBuilder();

        No atual = fim;
        while (atual != null){
            stb.append(atual.valor).append(" ");
            atual = atual.anterior;
        }

        return stb.toString().trim();
    }
}
