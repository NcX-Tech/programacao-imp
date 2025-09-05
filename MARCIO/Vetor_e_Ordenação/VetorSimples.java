package Vetor_e_Ordenação;

import java.util.Scanner;

public class VetorSimples {

    // Função para preencher o vetor com valores do usuário
    public static void preencherVetor(int[] vetor, int tamanho) {
        Scanner Entrada = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = Entrada.nextInt();
        }
    }

    // Função para imprimir o vetor no formato { x, y, z }
    public static void imprimirVetor(int[] vetor, int tamanho) {
        System.out.print("{ ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    // Função para ordenar o vetor com bubble sort
    public static void ordenar(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // Função para imprimir o maior número ímpar
    public static void imprimirMaiorImpar(int[] vetor, int tamanho) {
        int maior = -1;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 != 0 && vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        if (maior == -1) {
            System.out.println("Não há números ímpares no vetor");
        } else {
            System.out.println("Maior número ímpar: " + maior);
        }
    }

    // Função para separar os números pares e ímpares
    public static void criarParesImpares(int[] vetor, int tamanho, int[] pares, int[] impares) {
        // Preenche todos com -1
        for (int i = 0; i < tamanho; i++) {
            pares[i] = -1;
            impares[i] = -1;
        }

        int posPar = 0;
        int posImpar = 0;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 == 0) {
                pares[posPar] = vetor[i];
                posPar++;
            } else {
                impares[posImpar] = vetor[i];
                posImpar++;
            }
        }
    }

    // FUNÇÃO COMEÇA AQUI

    
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = Entrada.nextInt();

        int[] vetor = new int[tamanho];
        int[] pares = new int[tamanho];
        int[] impares = new int[tamanho];

        preencherVetor(vetor, tamanho);

        System.out.print("Vetor original: ");
        imprimirVetor(vetor, tamanho);

        ordenar(vetor, tamanho);
        System.out.print("Vetor ordenado: ");
        imprimirVetor(vetor, tamanho);

        imprimirMaiorImpar(vetor, tamanho);

        criarParesImpares(vetor, tamanho, pares, impares);
        System.out.print("Números pares: ");
        imprimirVetor(pares, tamanho);
        System.out.print("Números ímpares: ");
        imprimirVetor(impares, tamanho);
    }
}
