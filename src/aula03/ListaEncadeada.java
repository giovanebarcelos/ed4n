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
}
