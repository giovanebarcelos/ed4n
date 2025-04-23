package aula02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
2. Inverter uma Fila
📌 Enunciado: Escreva uma função que inverta
   os elementos de uma fila.
 */
public class InverterFila {
    public static void main(String[] args) {
        Queue<Integer> fila =
                new LinkedList<>(
                        Arrays.asList(
                                1,2,3,4,5,6
                        )
                );
        inverter(fila);
        System.out.println(fila);
    }

    private static void inverter(Queue<Integer> fila) {
        Stack<Integer> pilha =
                new Stack<Integer>();
        while (!fila.isEmpty()){
            pilha.push(fila.poll());
        }
        while (!pilha.isEmpty()){
           fila.add(pilha.pop());
        }
    }
}
