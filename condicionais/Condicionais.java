package condicionais;
import java.util.Scanner; // Importação do Scanner

public class Condicionais { 
    public static Scanner input = new Scanner(System.in); 

    public static void main(String[] args) {

        double peso; // Alterado para double para cálculos mais precisos
        System.out.print("Digite seu peso (kg): ");
        peso = input.nextDouble();

        double altura; // Alterado para double para permitir números com casas decimais
        System.out.print("Digite sua altura (m): ");
        altura = input.nextDouble();

        // Cálculo correto do IMC: peso / (altura * altura)
        double imc = peso / (altura * altura);

        System.out.println("Você tem um IMC igual a: " + imc);

        // Estrutura condicional corrigida e melhorada
        if (imc <= 18.5) {
            System.out.println("Seu IMC é: " + imc + ", sua classificação é: Magreza");
        } else if (imc <= 24.9) {
            System.out.println("Seu IMC é: " + imc + ", sua classificação é: Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Seu IMC é: " + imc + ", sua classificação é: Sobrepeso");
        } else {
            System.out.println("Seu IMC é: " + imc + ", sua classificação é: Obesidade");
        }
    }
}
