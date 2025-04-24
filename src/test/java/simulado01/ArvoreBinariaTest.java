package simulado01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArvoreBinariaTest {
    @Test
    public void deveInserirRaizCorretamente() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(10);
        assertEquals(1, arvore.contarNos());
        assertTrue(arvore.buscar(10));
    }

    @Test
    public void deveInserirVariosNosENavegarPelaArvore() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(20);
        arvore.inserir(10);
        arvore.inserir(30);
        arvore.inserir(5);
        arvore.inserir(15);
        assertEquals(5, arvore.contarNos());
        assertTrue(arvore.buscar(5));
        assertTrue(arvore.buscar(30));
        assertFalse(arvore.buscar(999));
    }

    @Test
    public void naoDeveInserirElementosDuplicados() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(50);
        arvore.inserir(25);
        arvore.inserir(50);  // duplicado, não incrementa
        assertEquals(2, arvore.contarNos());
        assertTrue(arvore.buscar(50));
    }

    @Test
    public void deveRetornarFalseSeBuscarValorInexistente() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(10);
        arvore.inserir(20);
        assertFalse(arvore.buscar(99));
    }

    @Test
    void deveRetornarZeroSeArvoreEstiverVazia() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertEquals(0, arvore.contarNos());
        assertFalse(arvore.buscar(1));
    }

    @Test
    public void deveInserirNumerosNegativosEPositivos() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(0);
        arvore.inserir(-10);
        arvore.inserir(10);
        assertEquals(3, arvore.contarNos());
        assertTrue(arvore.buscar(-10));
        assertTrue(arvore.buscar(10));
    }

    @Test
    public void testArvore() {
        ArvoreBinaria a = new ArvoreBinaria();
        a.inserir(5);
        a.inserir(3);
        assertTrue(a.buscar(3));
        assertEquals(2, a.contarNos());
    }
}