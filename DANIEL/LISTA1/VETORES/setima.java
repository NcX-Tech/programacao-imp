package VETORES;
import java.util.Scanner;
public class setima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[20], vetor2 = new int[20], resultado = new int[40];
        for(int i = 0; i < 20; i++) vetor1[i] = scanner.nextInt();
        for(int i = 0; i < 20; i++) vetor2[i] = scanner.nextInt();
        for(int i = 0; i < 20; i++) {
            resultado[i*2] = vetor1[i];
            resultado[i*2+1] = vetor2[i];
        }
        for(int num : resultado) System.out.print(num + " ");
        scanner.close();
    }
}