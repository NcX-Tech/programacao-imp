package VETORES;
import java.util.Scanner;
import java.util.ArrayList;
public class decimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[5], y = new int[5];
        
        for(int i = 0; i < 5; i++) x[i] = scanner.nextInt();
        for(int i = 0; i < 5; i++) y[i] = scanner.nextInt();
        
        // a. Soma
        System.out.print("Soma: ");
        for(int i = 0; i < 5; i++) System.out.print((x[i] + y[i]) + " ");
        
        // b. Produto
        System.out.print("\nProduto: ");
        for(int i = 0; i < 5; i++) System.out.print((x[i] * y[i]) + " ");
        
        // c. Diferença (x - y)
        System.out.print("\nDiferença: ");
        for(int i = 0; i < 5; i++) {
            boolean existeEmY = false;
            for(int j = 0; j < 5; j++) if(x[i] == y[j]) existeEmY = true;
            if(!existeEmY) System.out.print(x[i] + " ");
        }
        
        // d. Interseção
        System.out.print("\nInterseção: ");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(x[i] == y[j]) System.out.print(x[i] + " ");
            }
        }
        
        // e. União
        System.out.print("\nUnião: ");
        ArrayList<Integer> uniao = new ArrayList<>();
        for(int num : x) uniao.add(num);
        for(int num : y) if(!uniao.contains(num)) uniao.add(num);
        for(int num : uniao) System.out.print(num + " ");
        
        scanner.close();
    }
}