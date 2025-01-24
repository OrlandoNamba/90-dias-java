import java.util.Scanner;

public class somaDeNumerosImpares {
    public static void main(String[] args) {
        // Criar um scanner de números positivos
        Scanner scanner = new Scanner(System.in);

        // Ler o número fornecido pelo usuário
        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        // Permitir apenas números positivos
        if (numero >= 0) {
        } else {
            System.out.println("Digite apenas números positivos! O programa será encerrado.");
            return;
        }

        // Variável para armazenar a soma
        int soma = 0;

        // Cálcular a soma dos números ímpares de 1 até o número informado
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                soma += i; // Soma
            }
        }

        // Exibir a soma
        System.out.println("A    soma dos números ímpares até " + numero + " é: " + soma);

        // Fechar o scanner
        scanner.close();
    }
}