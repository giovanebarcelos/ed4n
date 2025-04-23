package aula01;

/*
1. Soma dos Elementos de um Array
   Dado um array de inteiros, calcule a soma
   de seus elementos.
 */
public class SomaElementos {
    public static void main(String[] args) {
        int[] numeros = {13, 8, 73, 1, 9};
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.printf("Soma: " + soma);
        imprimirSomaUsandoForTradicional(numeros);
        imprimirSomaUsandoWhile(numeros);
    }

    private static void imprimirSomaUsandoWhile(int[] numeros) {
        int soma = 0;
        int idx = 0;
        while (idx < numeros.length){
            soma += numeros[idx];
            idx++;
        }
        System.out.printf("\nSoma: " + soma);
    }

    private static void imprimirSomaUsandoForTradicional(int[] numeros) {
        int soma = 0;
        for (int idx = 0;
             idx < numeros.length; idx++){
            soma += numeros[idx];
        }
        System.out.printf("\nSoma: " + soma);
    }
}
