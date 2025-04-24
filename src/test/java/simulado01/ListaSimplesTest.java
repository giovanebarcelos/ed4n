package simulado01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListaSimplesTest {
    @Test
    public void deveInserirNoInicioUmaUnicaVez() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoInicio(10);
        assertEquals(1, lista.tamanho());
        assertTrue(lista.contem(10));
    }

    @Test
    public void deveInserirMultiplosElementosNoInicio() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoInicio(10);
        lista.inserirNoInicio(20);
        lista.inserirNoInicio(30);
        assertEquals(3, lista.tamanho());
        assertTrue(lista.contem(10));
        assertTrue(lista.contem(20));
        assertTrue(lista.contem(30));
    }

    @Test
    public void deveRetornarFalseSeValorNaoEstiverNaLista() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoInicio(1);
        lista.inserirNoInicio(2);
        lista.inserirNoInicio(3);
        assertFalse(lista.contem(999));
    }

    @Test
    public void deveRetornarTamanhoZeroParaListaVazia() {
        ListaSimples lista = new ListaSimples();
        assertEquals(0, lista.tamanho());
    }

    @Test
    public void deveRetornarTrueParaElementoUnico() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoInicio(42);
        assertTrue(lista.contem(42));
    }

    @Test
    public void devePermitirElementosDuplicados() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoInicio(5);
        lista.inserirNoInicio(5);
        assertEquals(2, lista.tamanho());
        assertTrue(lista.contem(5));
    }

    @Test
    public void testListaSimples() {
        ListaSimples l = new ListaSimples();
        l.inserirNoInicio(10);
        assertTrue(l.contem(10));
        assertEquals(1, l.tamanho());
    }
}