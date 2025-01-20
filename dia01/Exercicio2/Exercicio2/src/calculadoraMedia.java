import java.util.Scanner;

public class calculadoraMedia{
    public static void main(String[] args) {
        // Criar um Scanner de números decimais, para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Ler o valores
        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        // Calcular a soma dos 3 números
        double soma = a + b + c;
        // Calcular a media dos 3 números
        double media = soma / 3;

        // Mostrar a media
        System.out.printf("A média de A + B + C é: %.2f%n", media);

        // Comparar resultado
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        // Fechar o scanner
        scanner.close();
    }
}
