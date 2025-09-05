package VETORES;
import java.util.Scanner;
public class oitava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10], vetor2 = new int[10], resultado = new int[20];
        for(int i = 0; i < 10; i++) vetor1[i] = scanner.nextInt();
        for(int i = 0; i < 10; i++) vetor2[i] = scanner.nextInt();
        for(int i = 0; i < 20; i++) resultado[i] = (i % 2 == 0) ? vetor1[i/2] : vetor2[i/2];
        for(int num : resultado) System.out.print(num + " ");
        scanner.close();
    }
}