package ATIVIDADES;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Preencha o vetor: ");
            vetor[i] = scanner.nextInt();
        }

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 != 0){
                System.out.println("Esse numero é impar: " + vetor[i]);
            }
        }

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                System.out.println("Esse numero é par: " + vetor[i]);
            }
        }
    }
}
