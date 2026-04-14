package ATIVIDADES;
import java.util.Scanner;

public class atv1 { 
    
    // 1. Faça um programa que possua um vetor denominado A que armazene 6 
    // números inteiros. O programa deve executar os seguintes passos: 
    
    // a. Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
    // b. Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma
    // c. Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
    // d. Mostre na tela cada valor do vetor A, um em cada linha
    
    // 2. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os 
    // valores lidos.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[6];
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite os valores: ");
            vetor[i] = s.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite os valores: " + vetor[i]);
        }
    }
}