import java.util.Scanner;

public class contadorParesAndImpares {
    public static void main(String[] args) {
        // Criar um scanner de números positivos
        Scanner scanner = new Scanner(System.in);

        // Ler o número fornecido pelo usuário
        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        // Permitir apenas números positivos
        if (numero <= 0) {
            System.out.println("O número deve ser positivo! O programa será encerrado.");
            return;
        }

        // Variáveis para contar pares e ímpares
        int par = 0;
        int impar = 0;

        // Calcular números pares e ímpares
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        // Exibir os resultados
        System.out.println("Quantidade de números pares de 1 até " + numero + ": " + par);
        System.out.println("Quantidade de números ímpares de 1 até " + numero + ": " + impar);

        // Fechar o scanner
        scanner.close();
    }
}
