package MATRIZES;

import java.util.Scanner;
public class primeira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int count = 0;
        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
                if(matriz[i][j] > 10) count++;
            }
        }
        System.out.println("Valores > 10: " + count);
        scanner.close();
    }
}