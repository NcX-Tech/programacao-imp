import java.util.Scanner;

public class PesquisaidadeWHILE { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, somaIdades = 0, qtdPessoas = 0;
        double media;

        System.out.println("Digite sua idade (< 0 para sair):");
        idade = sc.nextInt();

        while (idade >= 0) {
            qtdPessoas += 1;
            somaIdades += idade;

            System.out.println("Digite sua idade (< 0 para sair):");
            idade = sc.nextInt();
        }
        
        if (qtdPessoas != 0) {
            media = (double) somaIdades / qtdPessoas;
            System.out.println(qtdPessoas + " pessoas participaram da pesquisa");
            System.out.println("A media das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
        
    }
}