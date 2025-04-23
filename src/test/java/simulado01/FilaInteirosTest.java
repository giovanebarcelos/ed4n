package simulado01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilaInteirosTest {
    @Test
    public void deveCriarFilaVazia() {
        FilaInteiros fila = new FilaInteiros(5);
        assertTrue(fila.estaVazia());
        assertEquals(0, fila.tamanho());
    }

    @Test
    public void deveEnfileirarUmElemento() {
        FilaInteiros fila = new FilaInteiros(5);
        fila.enfileirar(10);
        assertFalse(fila.estaVazia());
        assertEquals(1, fila.tamanho());
    }

    @Test
    public void deveEnfileirarVariosElementos() {
        FilaInteiros fila = new FilaInteiros(5);
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        assertEquals(3, fila.tamanho());
    }

    @Test
    void deveDesenfileirarNaOrdemCorreta() {
        FilaInteiros fila = new FilaInteiros(5);
        fila.enfileirar(100);
        fila.enfileirar(200);
        fila.enfileirar(300);
        assertEquals(100, fila.desenfileirar());
        assertEquals(200, fila.desenfileirar());
        assertEquals(300, fila.desenfileirar());
        assertTrue(fila.estaVazia());
    }

    @Test
    public void deveManterTamanhoCorretoAoDesenfileirar() {
        FilaInteiros fila = new FilaInteiros(3);
        fila.enfileirar(1);
        fila.enfileirar(2);
        assertEquals(2, fila.tamanho());
        fila.desenfileirar();
        assertEquals(1, fila.tamanho());
    }

    @Test
    public void deveCircularNoArray() {
        FilaInteiros fila = new FilaInteiros(3);
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        assertEquals(1, fila.desenfileirar());
        fila.enfileirar(4); // Deve circular para o início do array
        assertEquals(2, fila.desenfileirar());
        assertEquals(3, fila.desenfileirar());
        assertEquals(4, fila.desenfileirar());
        assertTrue(fila.estaVazia());
    }

    public void testFilaCircular() {
        FilaInteiros f = new FilaInteiros(3);
        f.enfileirar(1);
        f.enfileirar(2);
        assertEquals(1, f.desenfileirar());
        assertEquals(1, f.tamanho());
    }

}