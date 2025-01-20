import java.util.Scanner;

public class ComparacaoSoma {
    public static void main(String[] args) {
        // Criar um scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Ler os valores
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        // Calcular a soma
        int soma = a + b;

        // Mostrar a soma
        System.out.println("A soma de A + B é: " + soma);

        // Comparar com C e mostrar resultado
        if (soma < c) {
            System.out.println("A soma de A + B é menor que C");
        } else {
            System.out.println("A soma de A + B é maior que C");
        }

        // Fechar o Scanner
        scanner.close();
    }
}