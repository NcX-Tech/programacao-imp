package VETORES;
import java.util.Scanner;

public class treze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i = 0; i < n; i++) {
            int numero = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(numero + " ");
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
