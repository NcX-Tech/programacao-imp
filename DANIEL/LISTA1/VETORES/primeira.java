package VETORES;
public class primeira {
    
    public static void main(String[] args) {
        
        // a. Criar vetor A com 6 números inteiros e atribuir valores
        int[] A = new int[6];
        A[0] = 1;
        A[1] = 0;
        A[2] = 5;
        A[3] = -2;
        A[4] = -5;
        A[5] = 7;
        
        // b. Calcular soma das posições A[0], A[1] e A[5]
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma dos valores: " + soma);
        
        // c. Modificar a posição 4 para o valor 100
        A[4] = 100;
        System.out.println("Valor de A[4] modificado para: " + A[4]);
        
        // d. Mostrar todos os valores do vetor, um em cada linha
        System.out.println("\nValores do vetor A:");
        for(int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}