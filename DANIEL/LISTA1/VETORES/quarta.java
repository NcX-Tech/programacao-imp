package VETORES;
import java.util.Scanner;
public class quarta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[15];
        for(int i = 0; i < 15; i++) nomes[i] = scanner.nextLine();
        for(int i = 14; i >= 0; i--) System.out.println(nomes[i]);
        scanner.close();
    }
}