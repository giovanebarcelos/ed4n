package aula01;

import java.util.ArrayList;

public class MediaValoresArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numeros =
                new ArrayList<Integer>();
        numeros.add(13);
        numeros.add(8);
        numeros.add(73);

        Integer soma = 0;
        for (Integer num: numeros){
            soma += num;
        }
        double media = soma / numeros.size();
        System.out.printf("Média = " +
                media);
        imprimirComForTradicional(numeros);
    }

    private static void imprimirComForTradicional(ArrayList<Integer> numeros) {
        int soma = 0;
        for (int pos = 0;
             pos < numeros.size(); pos++){
            soma += numeros.get(pos);
        }
        double media = soma / numeros.size();
        System.out.printf("\nMédia = " +
                media);
    }
}
