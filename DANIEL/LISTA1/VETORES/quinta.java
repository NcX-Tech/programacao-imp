package VETORES;
import java.util.Scanner;
public class quinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        for(int i = 0; i < 20; i++) numeros[i] = scanner.nextInt();
        for(int i = 0; i < 20; i++) if(numeros[i] % 2 != 0) System.out.println(numeros[i]);
        for(int i = 0; i < 20; i++) if(i % 2 == 0) System.out.println(numeros[i]);
        scanner.close();
    }
}
