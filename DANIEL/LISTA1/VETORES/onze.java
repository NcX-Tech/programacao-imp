package VETORES;
import java.util.Scanner;

public class onze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] V = new double[10];
        double soma = 0, desvioPadrao = 0;
        
        for(int i = 0; i < 10; i++) {
            V[i] = scanner.nextDouble();
            soma += V[i];
        }
        
        double media = soma / 10;
        
        for(int i = 0; i < 10; i++) {
            desvioPadrao += Math.pow(V[i] - media, 2);
        }
        
        desvioPadrao = Math.sqrt(desvioPadrao / 9);
        System.out.printf("Desvio Padrão: %.2f", desvioPadrao);
        
        scanner.close();
    }
}