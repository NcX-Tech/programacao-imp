package MATRIZES;

import java.util.Arrays;

public class segundo {
    
    public static void exercicio1() {
        System.out.println("\n1. Matriz 5x5 com diagonal principal 1:");
        int[][] matriz = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }