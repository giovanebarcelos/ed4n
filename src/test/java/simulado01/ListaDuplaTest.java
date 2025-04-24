package simulado01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaDuplaTest {
    @Test
    public void deveInserirPrimeiroElemento() {
        ListaDupla lista = new ListaDupla();
        lista.inserirOrdenado(10);
        assertEquals("10", lista.imprimirInverso());
    }

    @Test
    public void deveInserirElementoMenorQueInicio() {
        ListaDupla lista = new ListaDupla();
        lista.inserirOrdenado(20);
        lista.inserirOrdenado(10); // Deve ir antes do 20
        assertEquals("20 10", lista.imprimirInverso());
    }

    @Test
    public void deveInserirElementoMaiorQueTodos() {
        ListaDupla lista = new ListaDupla();
        lista.inserirOrdenado(10);
        lista.inserirOrdenado(20);
        lista.inserirOrdenado(30); // Vai para o fim
        assertEquals("30 20 10", lista.imprimirInverso());
    }

    @Test
    public void deveInserirElementoNoMeio() {
        ListaDupla lista = new ListaDupla();
        lista.inserirOrdenado(10);
        lista.inserirOrdenado(30);
        lista.inserirOrdenado(20); // Vai entre 10 e 30
        assertEquals("30 20 10", lista.imprimirInverso());
    }

    @Test
    public void deveManterOrdemDecrescenteNaImpressaoInversa() {
        ListaDupla lista = new ListaDupla();
        lista.inserirOrdenado(15);
        lista.inserirOrdenado(5);
        lista.inserirOrdenado(25);
        lista.inserirOrdenado(10);
        lista.inserirOrdenado(20);
        assertEquals("25 20 15 10 5", lista.imprimirInverso());
    }

    @Test
    public void deveLidarComValoresDuplicados() {
        ListaDupla lista = new ListaDupla();
        lista.inserirOrdenado(10);
        lista.inserirOrdenado(10);
        lista.inserirOrdenado(10);
        assertEquals("10 10 10", lista.imprimirInverso());
    }

    @Test
    public void imprimirInversoDeListaVaziaDeveSerStringVazia() {
        ListaDupla lista = new ListaDupla();
        assertEquals("", lista.imprimirInverso());
    }

    @Test
    public void testListaDupla() {
        ListaDupla l = new ListaDupla();
        l.inserirOrdenado(3);
        l.inserirOrdenado(1);
        assertEquals("3 1", l.imprimirInverso());
    }
}