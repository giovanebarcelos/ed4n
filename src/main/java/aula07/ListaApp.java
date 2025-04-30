package aula07;

public class ListaApp {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.imprimir("Minha Lista Vazia");

        lista.inserir(new int[]{13, 8, 9});
        lista.imprimir("Minha Lista Preenchida");

        lista.remover(8);
        lista.imprimir("Minha Lista Após Remoção");

        lista.inserir(new int[]{73,36});
        lista.imprimir("Minha Lista Após Algumas Inserções");
    }
}
