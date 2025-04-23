package simulado01;

/*
  1 ponto
  Implemente uma classe PilhaString com:
  - Array de Strin  gs (tamanho fixo 10)
  - Métodos: empilhar(String), desempilhar(), estaVazia(), topo()
*/

public class PilhaString {
    private String[] dados = new String[10];
    private int topo = -1;

    public void empilhar(String s) {
        dados[++topo] = s;
    }

    public String desempilhar() {
        return dados[topo--];
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public String topo() {
        if (!this.estaVazia()){
            return this.dados[topo] ;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}