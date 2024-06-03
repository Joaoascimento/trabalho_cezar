package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem-vindo à calculadora!");

        while (true) {
            System.out.println("\nEscolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            int escolha = scanner.nextInt();

            if (escolha == 5) {
                System.out.println("Obrigado por usar a calculadora. Adeus!");
                break;
            }

            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();

            switch (escolha) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}

