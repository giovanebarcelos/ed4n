package simulado01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilhaStringTest {

    @Test
    public void deveEmpilharUmElemento() {
        PilhaString pilha = new PilhaString();
        pilha.empilhar("A");
        assertFalse(pilha.estaVazia());
        assertEquals("A", pilha.topo());
    }

    @Test
    public void deveEmpilharVariosElementosNaOrdem() {
        PilhaString pilha = new PilhaString();
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        assertEquals("C", pilha.topo());
    }

    @Test
    public void deveDesempilharElementoDoTopo() {
        PilhaString pilha = new PilhaString();
        pilha.empilhar("A");
        pilha.empilhar("B");
        String desempilhado = pilha.desempilhar();
        assertEquals("B", desempilhado);
        assertEquals("A", pilha.topo());
    }

    @Test
    public void deveRetornarTrueSePilhaEstiverVazia() {
        PilhaString pilha = new PilhaString();
        assertTrue(pilha.estaVazia());
    }

    @Test
    public void deveRetornarFalseSePilhaNaoEstiverVazia() {
        PilhaString pilha = new PilhaString();
        pilha.empilhar("Item");
        assertFalse(pilha.estaVazia());
    }

    @Test
    public void deveRetornarElementoDoTopoSemRemover() {
        PilhaString pilha = new PilhaString();
        pilha.empilhar("X");
        pilha.empilhar("Y");
        assertEquals("Y", pilha.topo());
        assertEquals("Y", pilha.topo()); // ainda é Y
    }

    @Test
    public void deveDesempilharTodosElementosAteFicarVazia() {
        PilhaString pilha = new PilhaString();
        pilha.empilhar("1");
        pilha.empilhar("2");
        pilha.empilhar("3");

        assertEquals("3", pilha.desempilhar());
        assertEquals("2", pilha.desempilhar());
        assertEquals("1", pilha.desempilhar());
        assertTrue(pilha.estaVazia());
    }

    // Testes extras opcionais:
    @Test
    public void deveFalharAoDesempilharDePilhaVazia() {
        PilhaString pilha = new PilhaString();
        assertThrows(ArrayIndexOutOfBoundsException.class, pilha::desempilhar);
    }

    @Test
    void deveFalharAoConsultarTopoDePilhaVazia() {
        PilhaString pilha = new PilhaString();
        assertThrows(ArrayIndexOutOfBoundsException.class, pilha::topo);
    }

    @Test
    public void testPilha() {
        PilhaString p = new PilhaString();
        assertTrue(p.estaVazia());
        p.empilhar("A");
        assertEquals("A", p.topo());
        p.empilhar("B");
        assertEquals("B", p.desempilhar());
    }
}

