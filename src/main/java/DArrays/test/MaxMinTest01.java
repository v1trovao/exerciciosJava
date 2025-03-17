package DArrays.test;

import DArrays.dominio.MaxMin;

public class MaxMinTest01 {

    public static void imprime(int[] list) {
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i != list.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("] ");
    }
    public static void main(String[] args) {
        int[] list = {42, 54, 65, 87, 0};

        MaxMin test = new MaxMin();

        // Encontrar o maior e menor numero da lista
        int maior = test.max(list);
        int menor = test.min(list);

        // Resultados
        imprime(list);
        System.out.print("-> maior: " + maior + " menor: " + menor);
    }
}
