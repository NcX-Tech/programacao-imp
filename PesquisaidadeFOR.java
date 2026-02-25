import java.util.Scanner;

public class PesquisaidadeFOR { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, somaIdades = 0, qtdPessoas = 0;
        double media;

        System.out.println("Digite quantidade de pessoas que participaram da pesquisa:");
        qtdPessoas = sc.nextInt();

        for(int i = 1; i <= qtdPessoas; i++) {
            System.out.println("Digite a idade do participante " + i + "° participante");
            idade = sc.nextInt();
            somaIdades += idade;
        }
        
        if (qtdPessoas >= 1) {
            media = calcularMedia(somaIdades, qtdPessoas);
            System.out.println(qtdPessoas + " pessoas participaram da pesquisa");
            System.out.println("A media das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }

    public static double calcularMedia(int somaIdades, int qtdPessoas) {
        return (double) somaIdades / qtdPessoas;
    }

    public static double acimadaMedia(int somaIdades, int qtdPessoas) {
        double media = calcularMedia(somaIdades, qtdPessoas);
        idade = 

        if (idade > media) {
            System.out.println("Idade " + idade + " é acima da média.");
        } 
    }
}
