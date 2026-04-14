package ATIVIDADES;
import java.util.Scanner;

//3. Escreva um algoritmo que Leia 10 valores inteiros e armazene-os em um Vetor. 
//Após a digitação do último valor, imprima os elementos com conteúdo par

public class atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Preencha o vetor: ");
            vetor[i] = scanner.nextInt();
        }

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                System.out.println("Esse numero é par: " + vetor[i]);
            }
        }
    }
}
