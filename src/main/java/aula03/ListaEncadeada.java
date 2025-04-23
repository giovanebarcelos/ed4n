package aula03;

public class ListaEncadeada {
    Nodo cabecao = null;

    public void inserir(int dado){
        Nodo novoNodo = new Nodo(dado);

        if (cabecao == null){
            cabecao = novoNodo;
            return;
        }

        Nodo temp = cabecao;
        while (temp.proximo != null){
            temp = temp.proximo;
        }
        temp.proximo = novoNodo;
    }

    public void mostrar() {
        Nodo temp = cabecao;
        while (temp != null){
            System.out.printf("%d\n", temp.dado);

            temp = temp.proximo;
        }
    }

    public void remover(int dado) {
        if (cabecao != null && cabecao.dado == dado){
            cabecao = cabecao.proximo;
            return;
        }

        Nodo temp = cabecao, anterior = null;
        while (temp != null && temp.dado != dado){
            anterior = temp;
            temp = temp.proximo;
        }
        if (temp == null) return;
        anterior.proximo = temp.proximo;
    }

    public void inserir(int[] dados) {
        for (int dado: dados){
            this.inserir(dado);
        }
    }

    public void reverter() {
        Nodo corrente = cabecao, proximo = null,
                anterior = null;

        while (corrente != null){
            proximo = corrente.proximo;
            corrente.proximo = anterior;
            anterior = corrente;
            corrente = proximo;
        }
        cabecao = anterior;
    }

    public void reverter1() {
        Nodo temp = cabecao,
                novoCabecao = null;

        while (temp != null){
            Nodo novoNodo = new Nodo(temp.dado);

            if (novoCabecao == null){
                novoCabecao = novoNodo;
            } else {
                novoNodo.proximo = novoCabecao;
                novoCabecao = novoNodo;
            }

            temp = temp.proximo;
        }

        cabecao = novoCabecao;
    }
}
