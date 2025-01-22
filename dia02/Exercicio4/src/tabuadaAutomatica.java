import java.util.Scanner;

public class tabuadaAutomatica {
    public static void main(String[] args) {
        // Criar um scanner de números inteiros para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Ler o número digitado pelo usuário
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        // Exibir a tabuada
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }

       // Fechar o scanner
        scanner.close();
    }
}