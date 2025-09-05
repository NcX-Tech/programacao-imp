package VETORES;
import java.util.Scanner;

public class doze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        
        for(int i = 0; i < 10; i++) {
            boolean numeroRepetido;
            
            do {
                numeroRepetido = false;
                System.out.print("Digite o " + (i+1) + "º número: ");
                int numero = scanner.nextInt();
                
                for(int j = 0; j < i; j++) {
                    if(vetor[j] == numero) {
                        numeroRepetido = true;
                        System.out.println("Número repetido! Digite outro.");
                        break;
                    }
                }
                
                if(!numeroRepetido) {
                    vetor[i] = numero;
                }
                
            } while(numeroRepetido);
        }
        
        System.out.println("\nVetor final:");
        for(int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
        
        scanner.close();
    }
}