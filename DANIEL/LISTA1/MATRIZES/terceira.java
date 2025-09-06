package MATRIZES;

public static void exercicio2() {
    System.out.println("\n2. Matriz 4x4 com produto linha x coluna:");
    int[][] matriz = new int[4][4];
    
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            matriz[i][j] = i * j;
        }
    }
    
    for (int i = 0; i < 4; i++) {
        System.out.println(Arrays.toString(matriz[i]));
    }
}