package VETORES;
import java.util.Scanner;

public class segunda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[6];
        
        for(int i = 0; i < 6; i++) {
            valores[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < 6; i++) {
            System.out.println(valores[i]);
        }
        
        scanner.close();
    }
}