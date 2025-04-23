package aula01;

public class MaiorMenor {
    public static void main(String[] args) {
        int[] numeros = {7,2,9,4,5,1};
        int maior = numeros[0],
                menor = numeros[0];

        for( int num: numeros){
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
        System.out.printf(
                "Maior: %d\nMenor %d",
                maior, menor);


    }
}
