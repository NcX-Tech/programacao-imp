package condicionais;
import java.util.Scanner; // importa o scanner

public class Main { 
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in); //cria um objeto denominado user que se baseia no valor incluido do usuário

        int[] N = new int[1000]; //array denomidada N, que vai até 10
        int V = user.nextInt(); //lê o valor que o usuário colocou
        
        N[0] = V;
        for (int i = 1; i < 1000; i++) { //
            N[i] = N[i - 1] * 2; //
        }

        for (int i = 0; i < 1000; i++) { //
            System.out.println("A");
            System.out.println("N[" + i + "] = " + N[i]); //
        }

        user.close(); //
    }
} 